package com.sigtrans.sigtrans.model.endereco.bairro;

import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Bairro {

    private @Id
    @GeneratedValue
    UUID id;

    @Column(name = "nome_bairro")
    private String nome;

    @ManyToOne
    private Municipio municipio;

    public Bairro() {
    }

    public Bairro(String nome, Municipio municipio) {
        this.nome = nome;
        this.municipio = municipio;
    }
}
