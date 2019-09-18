package com.sigtrans.sigtrans.model.ocorrencia.veiculo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class PosicaoVeiculo {
    @Column(name = "nome_posicao_veiculo")
    private String nome;

    public PosicaoVeiculo(String nome) {
        this.nome = nome;

    }

    public PosicaoVeiculo() {
    }
}
