package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@Entity
public class EquipamentoControleTrafego {
    @Column(name = "nome_equipamento_controle_trafego")
    private String nome;

    public EquipamentoControleTrafego(String nome) {
        this.nome = nome;
    }

    public EquipamentoControleTrafego() {
    }
}
