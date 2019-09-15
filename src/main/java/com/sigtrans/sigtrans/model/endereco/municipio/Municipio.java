package com.sigtrans.sigtrans.model.endereco.municipio;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Municipio {

    private @Id
    @GeneratedValue
    UUID id;


    @Column(name = "nome_municipio")
    private String nome;

    @Column(name = "id_parceiro")
    private UUID idParceiro;

    @ManyToOne
    private Estado estado;

    public Municipio() {
    }

    public Municipio(String nome, UUID idParceiro, Estado estado) {
        this.nome = nome;
        this.idParceiro = idParceiro;
        this.estado = estado;
    }
}
