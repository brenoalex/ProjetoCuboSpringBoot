package br.com.mv.locadora.controller;

import br.com.mv.locadora.DTO.LocadoraDto;
import br.com.mv.locadora.form.LocadoraForm;
import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.service.FranquiaService;
import br.com.mv.locadora.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/locadora")
public class PrimeiroEndpoint {

    @Autowired
    LocadoraService locadoraService;

    @Autowired
    FranquiaService franquiaService;


    @GetMapping()
    @Cacheable(value = "listaLocadoras")
    @Transactional
    public List<LocadoraDto> listarPorEndereco(String endereco) {

        if ( endereco != null ) {
            return LocadoraDto.converter(locadoraService.searchLocadoraByEndereco(endereco));
        }

        return LocadoraDto.converter(locadoraService.getLocadoras());

    }

    @GetMapping("/filter/franquia")
    @Transactional
    public List<LocadoraDto> listarPorNomeFranquia (String nomeFranquia) {

        if ( nomeFranquia != null ) {
            return LocadoraDto.converter(locadoraService.searchLocadoraByNomeFranquia(nomeFranquia));
        }

        return LocadoraDto.converter(locadoraService.getLocadoras());

    }

    @PostMapping
    @Transactional
    @CacheEvict( value = "listaLocadoras", allEntries = true)
    public ResponseEntity<Object> salvaLocadora(@RequestBody @Valid LocadoraForm locadoraForm ) {

        Optional<Locadora> locadoraOptional = locadoraService.getLocadora(locadoraForm.getNome());

        Locadora locadora = locadoraForm.converte(franquiaService);

        if(!locadoraOptional.isPresent()) {
            return  ResponseEntity.status(HttpStatus.CREATED).body(locadoraService.saveLocadora(locadora));
        }

        Optional<Franquia> franquiaOptional = franquiaService.getFranquia(locadoraForm.getNomeFranquia());

        if(!franquiaOptional.isPresent()) {
            return  ResponseEntity.status(HttpStatus.CREATED).body(locadoraService.saveLocadora(locadora));
        }

        return ResponseEntity.status(HttpStatus.CONFLICT).body("Locadora já conta no sistema ou franquia inexistente!");

    }

    @DeleteMapping("/{id}")
    @Transactional
    @CacheEvict( value = "listaLocadoras", allEntries = true)
    public ResponseEntity<Object> deletePet (@PathVariable Long id) {
        Optional<Locadora> locadoraOptional = locadoraService.getLocadoraById(id);

        if(locadoraOptional.isPresent()) {
            locadoraService.deleteLocadora(id);
            return ResponseEntity.status(HttpStatus.OK).body("Locadora removida com sucesso!");
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Locadora não encontrada!");

    }



}
