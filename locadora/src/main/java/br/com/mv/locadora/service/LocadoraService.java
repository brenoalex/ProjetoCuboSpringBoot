package br.com.mv.locadora.service;

import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.repository.LocadorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocadoraService {

    @Autowired
    LocadorasRepository locadorasRepository;

    public List<Locadora> getLocadoras() {
        return locadorasRepository.findAll();


    }

}
