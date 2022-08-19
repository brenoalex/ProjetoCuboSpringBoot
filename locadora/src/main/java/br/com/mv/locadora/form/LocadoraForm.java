package br.com.mv.locadora.form;

import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.service.FranquiaService;
import org.springframework.http.ResponseEntity;

public class LocadoraForm {

    private String nome;
    private String endereco;
    private boolean temRetirada;

    private String nomeFranquia;

    public Locadora converte( FranquiaService franquiaService) {

        Franquia franquia = franquiaService.findByNome(nomeFranquia);

        return new Locadora(
                nome,
                endereco,
                temRetirada,
                franquia
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isTemRetirada() {
        return temRetirada;
    }

    public void setTemRetirada(boolean temRetirada) {
        this.temRetirada = temRetirada;
    }

    public String getNomeFranquia() {
        return nomeFranquia;
    }

    public void setNomeFranquia(String nomeFranquia) {
        this.nomeFranquia = nomeFranquia;
    }
}
