package br.com.mv.locadora.DTO;

import br.com.mv.locadora.model.Franquia;
import br.com.mv.locadora.model.Locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LocadoraDto {

    private String nome;
    private String endereco;
    private boolean temRetirada;
    private Franquia franquia;

    public LocadoraDto ( Locadora locadora ) {

        this.nome = locadora.getNome();
        this.endereco = locadora.getEndereco();
        this.temRetirada = locadora.isTemRetirada();
        this.franquia = locadora.getFranquia();

    }

    public Franquia getFranquia() {
        return franquia;
    }

    public static List<LocadoraDto> converter(List<Locadora> locadora) {

        return locadora.stream().map(LocadoraDto::new).collect(Collectors.toList());

    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isTemRetirada() {
        return temRetirada;
    }
}
