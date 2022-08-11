package br.com.mv.locadora.model;

public class Locadora {

    private Long id;
    private String nome;
    private String endereco;
    private boolean temRetirada;

    public Locadora(Long id, String nome, String endereco, boolean temRetirada) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.temRetirada = temRetirada;
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
}
