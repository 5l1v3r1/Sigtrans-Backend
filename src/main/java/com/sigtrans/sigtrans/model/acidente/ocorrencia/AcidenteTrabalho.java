package com.sigtrans.sigtrans.model.acidente.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class AcidenteTrabalho {

	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "nome_acidente_trabalho")
	private String nome;

	public AcidenteTrabalho() {

	}
}