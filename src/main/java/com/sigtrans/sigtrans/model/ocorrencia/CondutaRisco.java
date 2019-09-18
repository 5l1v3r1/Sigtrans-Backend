package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class CondutaRisco {
    @Column(name = "nome")
    private String nome;

    @Column(name = "data_insercao")
    private Date dataInsercao;

    public CondutaRisco(String nome, Date dataInsercao) {
        this.nome = nome;
        this.dataInsercao = dataInsercao;
    }

    public CondutaRisco() {
    }
}
