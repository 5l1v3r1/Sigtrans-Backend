package com.sigtrans.sigtrans.model.ocorrencia.dados;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class TipoAcidente {
    @Column(name = "nome_tipo_acidente")
    private String nome;

    @Column(name = "origem")
    private String origem;

    public TipoAcidente(String nome, String origem) {
        this.nome = nome;
        this.origem = origem;
    }

    public TipoAcidente() {
    }
}
