package com.sigtrans.sigtrans.model.ocorrencia.veiculo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class CategoriaVeiculo {
    @Column(name = "nome_categoria_veiculo")
    private String nome;

    public CategoriaVeiculo(String nome) {
        this.nome = nome;
    }

    public CategoriaVeiculo() {
    }
}
