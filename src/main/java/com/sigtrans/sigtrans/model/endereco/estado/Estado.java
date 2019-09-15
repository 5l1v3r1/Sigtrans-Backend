package com.sigtrans.sigtrans.model.endereco.estado;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Estado {

    private @Id
    @GeneratedValue
    UUID id;

    @Column(name = "id_parceiro")
    private UUID idParceiro;

    @Column(name = "nome_estado")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

    public Estado() {
    }

    public Estado(UUID idParceiro, String nome, String sigla) {
        this.idParceiro = idParceiro;
        this.nome = nome;
        this.sigla = sigla;
    }
}
