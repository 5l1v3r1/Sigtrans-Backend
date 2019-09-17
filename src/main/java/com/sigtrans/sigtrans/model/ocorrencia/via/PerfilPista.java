package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class PerfilPista {
    @Column(name = "nome_perfil_pista")
    private String nome;

    public PerfilPista() {
    }

    public PerfilPista(String nome) {
        this.nome = nome;

    }
}
