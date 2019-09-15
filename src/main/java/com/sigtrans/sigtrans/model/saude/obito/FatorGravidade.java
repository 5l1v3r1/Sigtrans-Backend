package com.sigtrans.sigtrans.model.saude.obito;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

@Data
@Entity
public class FatorGravidade {
	
	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "data_insercao")
	private Date dataInsercao;

	public FatorGravidade() {
		
	}
}