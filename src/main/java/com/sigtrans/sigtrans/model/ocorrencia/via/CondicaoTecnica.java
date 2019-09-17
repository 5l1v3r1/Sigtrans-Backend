package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class CondicaoTecnica {
    @Column(name = "nome_condicao_tecnica")
    private String nome;

    public CondicaoTecnica(String nome) {
        this.nome = nome;
    }

    public CondicaoTecnica() {
    }
}
