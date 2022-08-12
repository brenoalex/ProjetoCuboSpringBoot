package br.com.mv.locadora.model;

public class Locadora {

    private Long id;
    private String nome;
    private String endereco;
    private boolean temRetirada;
    private Franquia franquia;

    public Locadora( String nome, String endereco, boolean temRetirada, Franquia franquia) {
        this.nome = nome;
        this.endereco = endereco;
        this.temRetirada = temRetirada;
        this.franquia = franquia;
    }

    public Franquia getFranquia() {
        return franquia;
    }

    public void setFranquia(Franquia franquia) {
        this.franquia = franquia;
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
