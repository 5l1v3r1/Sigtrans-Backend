package com.sigtrans.sigtrans.model.endereco.rua;

import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Rua {

    private @Id
    @GeneratedValue
    UUID id;

    @Column(name = "nome_rua")
    private String nome;

    @Column(name = "id_parceiro")
    private UUID idParceiro;

    @ManyToOne
    private Municipio municipio;

    public Rua() {
    }

    public Rua(String nome, UUID idParceiro, Municipio municipio) {
        this.nome = nome;
        this.idParceiro = idParceiro;
        this.municipio = municipio;
    }
}
