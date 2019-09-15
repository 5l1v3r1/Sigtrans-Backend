package com.sigtrans.sigtrans.model.saude.obito;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class FatorRiscoValor {

	private @Id
	@GeneratedValue
	Long id;

	@ManyToOne
	private FatorRisco fatorRisco;

	@Column(name = "valor")
	private Integer valor;

	public FatorRiscoValor() {

	}

	public FatorRiscoValor(FatorRisco fatorRisco, Integer valor)
	{
		this.fatorRisco = fatorRisco;
		this.valor = valor;
	}
}