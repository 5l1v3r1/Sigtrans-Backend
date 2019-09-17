package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class SinaisPneus {
    @Column(name = "nome_sinais_pneus")
    private String nome;

    public SinaisPneus(String nome) {
        this.nome = nome;
    }

    public SinaisPneus() {
    }
}
