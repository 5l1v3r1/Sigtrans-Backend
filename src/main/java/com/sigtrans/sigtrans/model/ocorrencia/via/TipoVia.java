package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class TipoVia {
    @Column(name = "nome_tipo_via")
    private String nome;

    public TipoVia(String nome) {
        this.nome = nome;
    }

    public TipoVia() {
    }
}
