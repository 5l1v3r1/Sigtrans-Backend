package com.sigtrans.sigtrans.model.estado;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Estado {

    private @Id
    @GeneratedValue
    Long id;

    @Column(name = "id_parceiro")
    private long idParceiro;

    @Column(name = "nome_estado")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

    public Estado() {
    }

    public Estado(long idParceiro, String nome, String sigla) {
        this.idParceiro = idParceiro;
        this.nome = nome;
        this.sigla = sigla;
    }
}
