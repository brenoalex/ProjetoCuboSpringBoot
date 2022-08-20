package br.com.mv.locadora.form;

import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;
import br.com.mv.locadora.service.FranquiaService;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LocadoraForm {

    @NotEmpty @NotNull @Length(min = 2, max = 50)
    private String nome;

    @NotEmpty @NotNull @Length(min = 8, max = 100)
    private String endereco;

    private boolean temRetirada;

    @NotEmpty @NotNull @Length(min = 2)
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
