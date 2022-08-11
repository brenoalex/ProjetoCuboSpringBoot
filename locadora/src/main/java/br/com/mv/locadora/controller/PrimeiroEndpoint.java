package br.com.mv.locadora.controller;

import br.com.mv.locadora.DTO.LocadoraDto;
import br.com.mv.locadora.model.Locadora;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class PrimeiroEndpoint {

    @RequestMapping("/")
    @ResponseBody
    public List<LocadoraDto> ola() {

        Locadora locadora = new Locadora(
            1L,
                "Aki Discos",
                "Imbiribeira",
                true
        );

        Locadora locadora2 = new Locadora(
                2L,
                "Saraiva",
                "Pe. Carapuçeiro"
                , true
        );

        return LocadoraDto.converter(Arrays.asList(locadora, locadora2));

    }

}
