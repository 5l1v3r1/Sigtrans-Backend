package com.sigtrans.sigtrans.model.saude.obito;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class AnaliseObito {

	private @Id
	@GeneratedValue
	Long id;

	@ManyToMany(fetch = FetchType.EAGER, 
			cascade = { 
					CascadeType.PERSIST, 
					CascadeType.MERGE, 
					CascadeType.REFRESH 
			})
	private Set<FatorRiscoValor> fatoresRisco;

	@ManyToMany(fetch = FetchType.EAGER, 
			cascade = { 
					CascadeType.PERSIST, 
					CascadeType.MERGE, 
					CascadeType.REFRESH 
			})
	private Set<CondutaRiscoValor> condutasRisco;

	@ManyToMany(fetch = FetchType.EAGER, 
			cascade = { 
					CascadeType.PERSIST, 
					CascadeType.MERGE, 
					CascadeType.REFRESH 
			})
	private Set<FatorGravidadeValor> fatoresGravidade;

	public AnaliseObito() {

	}

	public AnaliseObito(Set<FatorRiscoValor> fatoresRisco, 
			Set<CondutaRiscoValor> condutasRisco,
			Set<FatorGravidadeValor> fatoresGravidade) {
		this.fatoresRisco = fatoresRisco;
		this.condutasRisco = condutasRisco;
		this.fatoresGravidade = fatoresGravidade;
	}
}