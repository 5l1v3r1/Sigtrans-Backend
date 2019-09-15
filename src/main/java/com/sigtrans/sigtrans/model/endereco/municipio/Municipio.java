package com.sigtrans.sigtrans.model.endereco.municipio;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Municipio {

    private @Id
    @GeneratedValue
    Long id;

    @Column(name = "nome_municipio")
    private String nome;

    @Column(name = "id_parceiro")
    private Integer idParceiro;

    @ManyToOne
    private Estado estado;

    public Municipio() {
    }

    public Municipio(String nome, Integer idParceiro, Estado estado) {
        this.nome = nome;
        this.idParceiro = idParceiro;
        this.estado = estado;
    }
}
