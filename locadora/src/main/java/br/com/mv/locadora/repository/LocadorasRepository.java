package br.com.mv.locadora.repository;

import br.com.mv.locadora.model.Locadora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocadorasRepository extends JpaRepository<Locadora, Long> {


    List<Locadora> findByNome(String nome);

    List<Locadora> findByFranquia_Nome(String nomeFranquia);
}
