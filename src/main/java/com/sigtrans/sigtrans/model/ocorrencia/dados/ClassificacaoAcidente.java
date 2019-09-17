package com.sigtrans.sigtrans.model.ocorrencia.dados;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class ClassificacaoAcidente {

    @Column(name = "nome_classificacao_acidente")
    private String nome;

    public ClassificacaoAcidente(String nome) {
        this.nome = nome;
    }

    public ClassificacaoAcidente() {
    }
}
