package com.sigtrans.sigtrans.model.saude.obito;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UsuarioContributivo {

	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "abreviatura")
	private String abreviatura;

	@Column(name = "descricao")
	private String descricao;

	public UsuarioContributivo() {
		
	}
}