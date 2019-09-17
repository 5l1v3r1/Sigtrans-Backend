package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Acostamento {
    @Column(name = "nome_acostamento")
    private String nome;

    public Acostamento(String nome) {
        this.nome = nome;
    }

    public Acostamento() {
    }
}
