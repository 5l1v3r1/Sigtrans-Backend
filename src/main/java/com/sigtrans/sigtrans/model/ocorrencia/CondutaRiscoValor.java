package com.sigtrans.sigtrans.model.ocorrencia;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class CondutaRiscoValor {
    @ManyToOne
    private CondutaRisco condutaRisco;

    @Column(name = "valor")
    private Integer valor;

    public CondutaRiscoValor(CondutaRisco condutaRisco, Integer valor) {
        this.condutaRisco = condutaRisco;
        this.valor = valor;
    }

    public CondutaRiscoValor() {
    }
}
