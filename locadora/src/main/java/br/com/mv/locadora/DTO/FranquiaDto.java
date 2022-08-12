package br.com.mv.locadora.DTO;

import br.com.mv.locadora.model.Franquia;

public class FranquiaDto {

    private String nome;
    private String enderecoMatriz;
    private String dataDeFundacao;

    public FranquiaDto(Franquia franquia) {

        this.nome = franquia.getNome();
        this.enderecoMatriz = franquia.getEnderecoMatriz();
        this.dataDeFundacao = franquia.getDataDeFundacao();

    }

    public String getNome() {
        return nome;
    }

    public String getEnderecoMatriz() {
        return enderecoMatriz;
    }

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }
}
