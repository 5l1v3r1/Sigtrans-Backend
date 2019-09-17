package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Semaforo {
    @Column(name = "nome_semaforo")
    private String nome;

    public Semaforo(String nome) {
        this.nome = nome;
    }

    public Semaforo() {
    }
}
