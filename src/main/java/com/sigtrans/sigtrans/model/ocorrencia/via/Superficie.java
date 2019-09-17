package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Superficie {
    @Column(name = "nome_superficie")
    private String nome;

    public Superficie(String nome) {
        this.nome = nome;
    }

    public Superficie() {
    }
}
