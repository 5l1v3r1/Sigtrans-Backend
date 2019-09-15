package com.sigtrans.sigtrans.model.saude.paciente;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class Paciente {

	private @Id
	@GeneratedValue
	Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "nome_mae")
	private String nomeMae;

	@Column(name = "numero_cartao_sus")
	private String numeroCartaoSus;

	@Column(name = "data_nasc")
	private Date dataNascimento;

	@ManyToOne
	private Rua rua;

	@Column(name = "numero")
	private String numero;

	@Column(name = "complemento")
	private String complemento;

	@ManyToOne
	private Bairro bairro;

	@ManyToOne
	private Municipio municipioOriginal;

	@ManyToOne
	private Estado estadoOriginal;

	@Column(name = "numero_documento")
	private String numeroDocumento;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "sexo")
	private char sexo;

	public Paciente() {
		
	}
}