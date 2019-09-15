package com.sigtrans.sigtrans.model.saude.obito;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.util.Set;

@Data
@Entity
public class FatorCondutaGravidadeAno {

	private @Id
	@GeneratedValue
	Long id;

	@OneToOne
	@MapsId
	private Ano ano;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Set<FatorRisco> fatoresRisco;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Set<FatorGravidade> fatoresGravidade;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Set<CondutaRisco> condutasRisco;

	public FatorCondutaGravidadeAno() {

	}
}