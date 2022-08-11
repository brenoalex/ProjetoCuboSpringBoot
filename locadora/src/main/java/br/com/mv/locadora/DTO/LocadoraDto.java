package br.com.mv.locadora.DTO;

import br.com.mv.locadora.model.Locadora;

import java.util.ArrayList;
import java.util.List;

public class LocadoraDto {

    private String nome;
    private String endereco;
    private boolean temRetirada;

    public LocadoraDto ( Locadora locadora ) {

        this.nome = locadora.getNome();
        this.endereco = locadora.getEndereco();
        this.temRetirada = locadora.isTemRetirada();

    }

    public static List<LocadoraDto> converter(List<Locadora> locadora) {

        List<LocadoraDto> listLocadoraDto = new ArrayList<>();

        for ( int i = 0; i < locadora.size(); i++ ) {

            LocadoraDto locadoraDto = new LocadoraDto(locadora.get(i));

            listLocadoraDto.add(locadoraDto);

        }

        return listLocadoraDto;

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
