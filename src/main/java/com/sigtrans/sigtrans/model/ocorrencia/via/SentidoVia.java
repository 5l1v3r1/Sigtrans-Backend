package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class SentidoVia {
    @Column(name = "nome_sentido_via")
    private String nome;

    public SentidoVia(String nome) {
        this.nome = nome;
    }

    public SentidoVia() {
    }
}
