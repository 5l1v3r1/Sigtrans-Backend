package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Sinalizacao {
    @Column(name = "nome_sinalizacao")
    private String nome;

    public Sinalizacao(String nome) {
        this.nome = nome;
    }

    public Sinalizacao() {
    }
}
