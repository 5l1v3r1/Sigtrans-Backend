package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Vitima extends Envolvido {
    @ManyToOne
    private Lesoes lesao;

    @ManyToOne
    private LocalEncaminhado localEncaminhado;

    @Column(name = "aih")
    private String aih;

    public Vitima() {
    }

    public Vitima(Lesoes lesao, LocalEncaminhado localEncaminhado, String aih) {
        this.lesao = lesao;
        this.localEncaminhado = localEncaminhado;
        this.aih = aih;

    }
}
