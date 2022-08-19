package br.com.mv.locadora.controller;

import br.com.mv.locadora.DTO.LocadoraDto;
import br.com.mv.locadora.form.LocadoraForm;
import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.service.FranquiaService;
import br.com.mv.locadora.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/locadora")
public class PrimeiroEndpoint {

    @Autowired
    LocadoraService locadoraService;

    @Autowired
    FranquiaService franquiaService;

    @GetMapping()
    public List<LocadoraDto> listar(String nome) {

        if ( nome != null ) {
            return LocadoraDto.converter(locadoraService.searchLocadoraByNome(nome));
        }

        return LocadoraDto.converter(locadoraService.getLocadoras());

    }

    @GetMapping("/filter/franquia")
    public List<LocadoraDto> listarPorNomeFranquia (String nomeFranquia) {

        if ( nomeFranquia != null ) {
            return LocadoraDto.converter(locadoraService.searchLocadoraByNomeFranquia(nomeFranquia));
        }

        return LocadoraDto.converter(locadoraService.getLocadoras());

    }

    @PostMapping
    public ResponseEntity<Object> salvaLocadora(@RequestBody LocadoraForm locadoraForm ) {
        Locadora locadora = locadoraForm.converte(franquiaService);
        return  ResponseEntity.status(HttpStatus.CREATED).body(locadoraService.saveLocadora(locadora));
    }

}
