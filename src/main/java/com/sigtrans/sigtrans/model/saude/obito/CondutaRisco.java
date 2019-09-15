package com.sigtrans.sigtrans.model.saude.obito;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

import java.util.Date;

@Data
@Entity
public class CondutaRisco {
	
	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "data_insercao")
	private Date dataInsercao;

	public CondutaRisco() {
		
	}
}