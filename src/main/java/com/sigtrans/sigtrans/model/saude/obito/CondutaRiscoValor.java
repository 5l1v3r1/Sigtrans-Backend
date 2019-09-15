package com.sigtrans.sigtrans.model.saude.obito;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class CondutaRiscoValor {

	private @Id
	@GeneratedValue
	Long id;

	@ManyToOne
	private CondutaRisco condutaRisco;

	@Column(name = "valor")
	private Integer valor;

	public CondutaRiscoValor() {
		
	}

	public CondutaRiscoValor(CondutaRisco condutaRisco, Integer valor) {
		this.condutaRisco = condutaRisco;
		this.valor = valor;
	}
}