package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class CondicoesClimaticas {
    @Column(name = "nome_condicoes_climaticas")
    private String nome;

    public CondicoesClimaticas() {
    }

    public CondicoesClimaticas(String nome) {
        this.nome = nome;

    }
}
