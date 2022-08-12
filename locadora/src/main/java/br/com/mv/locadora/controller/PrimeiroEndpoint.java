package br.com.mv.locadora.controller;

import br.com.mv.locadora.DTO.LocadoraDto;
import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/locadora")
public class PrimeiroEndpoint {

    @GetMapping("/")
    public List<LocadoraDto> ola() {

        Locadora locadora = new Locadora(
                "Aki Discos",
                "Imbiribeira",
                true,
                new Franquia("Aki","Av. São Paulo","1978")
        );

        Locadora locadora2 = new Locadora(
                "Saraiva",
                "Pe. Carapuçeiro"
                , true,
                new Franquia("Aki","Av. São Paulo","1982")
        );

        return LocadoraDto.converter(Arrays.asList(locadora, locadora2));

    }

}
