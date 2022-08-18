package br.com.mv.locadora.model;

import javax.persistence.*;

@Entity
@Table(name = "LOCADORA_TABLE")
public class Locadora {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(length = 70, nullable = false)
    private String nome;

    @Column(length = 70, nullable = false)
    private String endereco;

    @Column( nullable = false )
    private boolean temRetirada;

    @ManyToOne
    private Franquia franquia;

    public Locadora( ) {

    }

    public Locadora(String nome, String endereco, boolean temRetirada, Franquia franquia) {
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
