package br.com.mv.locadora.model;

import javax.persistence.*;


@Entity
@Table(name = "FRANQUIA_TABLE")
public class Franquia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 160, nullable = false)
    private String nome;
    @Column( nullable = false )
    private String enderecoMatriz;
    @Column
    private String dataDeFundacao;

    public Franquia(String nome, String enderecoMatriz, String dataDeFundacao) {
        this.nome = nome;
        this.enderecoMatriz = enderecoMatriz;
        this.dataDeFundacao = dataDeFundacao;
    }

    public Franquia () {

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
