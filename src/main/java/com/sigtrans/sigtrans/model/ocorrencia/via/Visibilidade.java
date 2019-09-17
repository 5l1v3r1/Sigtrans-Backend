package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@Entity
public class Visibilidade {
    @Column(name = "nome_visibilidade")
    private String nome;

    public Visibilidade(String nome) {
        this.nome = nome;
    }

    public Visibilidade() {
    }
}
