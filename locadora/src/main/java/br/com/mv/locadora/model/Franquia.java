package br.com.mv.locadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Franquia {

    private Long id;
    private String nome;
    private String enderecoMatriz;
    private String dataDeFundacao;

    public Franquia(String nome, String enderecoMatriz, String dataDeFundacao) {
        this.nome = nome;
        this.enderecoMatriz = enderecoMatriz;
        this.dataDeFundacao = dataDeFundacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoMatriz() {
        return enderecoMatriz;
    }

    public void setEnderecoMatriz(String enderecoMatriz) {
        this.enderecoMatriz = enderecoMatriz;
    }

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(String dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }
}
