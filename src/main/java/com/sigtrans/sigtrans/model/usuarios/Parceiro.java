package com.sigtrans.sigtrans.model.usuarios;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Parceiro {
    @Column(name = "nome_parceiro")
    private String nome;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Municipio municipio;

    @Column(name = "observacao")
    private String observacao;

    public Parceiro(String nome, Estado estado, Municipio municipio, String observacao) {
        this.nome = nome;
        this.estado = estado;
        this.municipio = municipio;
        this.observacao = observacao;
    }

    public Parceiro() {
    }
}
