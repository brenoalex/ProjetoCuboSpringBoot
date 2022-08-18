package br.com.mv.locadora.controller;

import br.com.mv.locadora.DTO.LocadoraDto;
import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/locadora")
public class PrimeiroEndpoint {

    @Autowired
    LocadoraService locadoraService;

    @GetMapping("/")
    public List<LocadoraDto> ola() {

        return LocadoraDto.converter(locadoraService.getLocadoras());

    }

}
