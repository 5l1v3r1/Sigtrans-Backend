package com.sigtrans.sigtrans.model.acidente.ocorrencia;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ClassificacaoAcidente {

	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "nome_classificacao_acidente")
	private String nome;

	public ClassificacaoAcidente() {

	}
}