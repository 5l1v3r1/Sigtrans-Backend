package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class ConservacaoVia {

    @Column(name = "nome_conservacao_via")
    private String nome;

    public ConservacaoVia(String nome) {
        this.nome = nome;
    }

    public ConservacaoVia() {
    }
}
