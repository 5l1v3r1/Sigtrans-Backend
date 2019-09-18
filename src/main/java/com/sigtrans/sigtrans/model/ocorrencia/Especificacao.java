package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Especificacao {
    @Column(name = "descricao")
    private String descricao;

    public Especificacao(String descricao) {
        this.descricao = descricao;
    }

    public Especificacao() {
    }
}
