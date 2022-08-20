package br.com.mv.locadora.service;

import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.repository.LocadorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocadoraService {

    @Autowired
    LocadorasRepository locadorasRepository;

    public List<Locadora> getLocadoras() {
        return locadorasRepository.findAll();


    }

    public List<Locadora> searchLocadoraByEndereco(String endereco) {
        return locadorasRepository.findByEndereco(endereco);
    }

    public List<Locadora> searchLocadoraByNomeFranquia(String nomeFranquia) {
        return locadorasRepository.findByFranquia_Nome(nomeFranquia);
    }

    public Locadora saveLocadora(Locadora locadora) {
        return locadorasRepository.save(locadora);
    }

    public Optional<Locadora> getLocadora(String nome) {

       return locadorasRepository.findByNome(nome);

    }

    public Optional<Locadora> getLocadoraById(Long id) {
        return locadorasRepository.findById(id);
    }

    public void deleteLocadora(Long id) {
        locadorasRepository.deleteById(id);
    }
}
