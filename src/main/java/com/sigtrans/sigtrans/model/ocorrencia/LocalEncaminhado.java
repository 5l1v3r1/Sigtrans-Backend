package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class LocalEncaminhado {
    @Column(name = "nome_local_encaminhado")
    private String nome;

    public LocalEncaminhado() {
    }

    public LocalEncaminhado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
