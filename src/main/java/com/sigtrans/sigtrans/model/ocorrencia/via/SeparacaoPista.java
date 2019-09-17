package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class SeparacaoPista {

    @Column(name = "nome_separacao_pista")
    private String nome;

    public SeparacaoPista(String nome) {
        this.nome = nome;
    }

    public SeparacaoPista() {
    }
}
