package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class GrauInstrucao {

    @Column(name = "nome_instrucao")
    private String nome;

    public GrauInstrucao(String nome) {
        this.nome = nome;
    }

    public GrauInstrucao() {
    }
}
