package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Lesoes {
    @Column(name = "nome_lesao")
    private String nome;

    public Lesoes(String nome) {
        this.nome = nome;
    }

    public Lesoes() {
    }
}
