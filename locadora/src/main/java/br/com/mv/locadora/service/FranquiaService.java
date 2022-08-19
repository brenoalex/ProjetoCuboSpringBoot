package br.com.mv.locadora.service;

import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranquiaService {

    @Autowired
    FranquiaRepository franquiaRepository;

    public Franquia findByNome(String nomeFranquia) {

        return franquiaRepository.findByNome(nomeFranquia);

    }
}
