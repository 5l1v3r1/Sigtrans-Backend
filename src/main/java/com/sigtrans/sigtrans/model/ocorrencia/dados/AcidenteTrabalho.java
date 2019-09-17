package com.sigtrans.sigtrans.model.ocorrencia.dados;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class AcidenteTrabalho {
    @Column(name = "nome_acidente_trabalho")
    private String nome;

    public AcidenteTrabalho(String nome) {
        this.nome = nome;
    }

    public AcidenteTrabalho() {
    }
}
