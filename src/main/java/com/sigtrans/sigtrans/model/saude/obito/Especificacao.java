package com.sigtrans.sigtrans.model.saude.obito;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Especificacao {

	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "descricao")
	private String descricao;

	public Especificacao() {

	}
}