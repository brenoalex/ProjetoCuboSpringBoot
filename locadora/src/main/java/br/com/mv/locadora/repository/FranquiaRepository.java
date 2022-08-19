package br.com.mv.locadora.repository;

import br.com.mv.locadora.model.Franquia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FranquiaRepository extends JpaRepository<Franquia, Long> {

    Franquia findByNome(String nomeFranquia);
}
