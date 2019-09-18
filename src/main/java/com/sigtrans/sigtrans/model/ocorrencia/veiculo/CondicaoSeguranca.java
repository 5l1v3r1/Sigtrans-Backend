package com.sigtrans.sigtrans.model.ocorrencia.veiculo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class CondicaoSeguranca {
    @Column(name = "nome_condicao_seguranca")
    private String nome;

    public CondicaoSeguranca(String nome) {
        this.nome = nome;
    }

    public CondicaoSeguranca() {
    }
}
