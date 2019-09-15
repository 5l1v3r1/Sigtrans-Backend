package com.sigtrans.sigtrans.model.saude.obito;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class FatorGravidadeValor {

	private @Id
	@GeneratedValue
	Long id;

	@ManyToOne
	private FatorGravidade fatorGravidade;

	@Column(name = "valor")
	private Integer valor;

	public FatorGravidadeValor() {

	}

	public FatorGravidadeValor(FatorGravidade fatorGravidade, Integer valor) {
		this.fatorGravidade = fatorGravidade;
		this.valor = valor;
	}
}