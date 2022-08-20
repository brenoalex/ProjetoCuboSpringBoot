package br.com.mv.locadora.repository;

import br.com.mv.locadora.model.Locadora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LocadorasRepository extends JpaRepository<Locadora, Long> {


    List<Locadora> findByEndereco(String endereco);

    List<Locadora> findByFranquia_Nome(String nomeFranquia);

    Optional<Locadora> findByNome(String nome);
}
