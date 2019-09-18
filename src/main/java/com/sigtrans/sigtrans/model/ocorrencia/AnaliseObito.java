package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Data
@Entity
public class AnaliseObito {
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinTable(name = "analiseobito_fatorriscovalor", joinColumns =
//            {@JoinColumn(name = "analiseobito_id")}, inverseJoinColumns =
//            {@JoinColumn(name = "fatorriscovalor_id")})
    private Set<FatorRiscoValor> fatoresRisco;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinTable(name = "analiseobito_condutariscovalor", joinColumns =
//            {@JoinColumn(name = "analiseobito_id")}, inverseJoinColumns =
//            {@JoinColumn(name = "condutariscovalor_id")})
    private Set<CondutaRiscoValor> condutasRisco;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinTable(name = "analiseobito_fatorgravidadevalor", joinColumns =
//            {@JoinColumn(name = "analiseobito_id")}, inverseJoinColumns =
//            {@JoinColumn(name = "fatorgravidadevalor_id")})
    private Set<FatorGravidadeValor> fatoresGravidade;

    public AnaliseObito(Set<FatorRiscoValor> fatoresRisco, Set<CondutaRiscoValor> condutasRisco, Set<FatorGravidadeValor> fatoresGravidade) {
        this.fatoresRisco = fatoresRisco;
        this.condutasRisco = condutasRisco;
        this.fatoresGravidade = fatoresGravidade;

    }

    public AnaliseObito() {
    }
}
