package com.sigtrans.sigtrans.model.ocorrencia;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class FatorCondutaGravidadeAno {
    @OneToOne
    @MapsId
    private Ano ano;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
//    @JoinTable(name = "fatorcondutagravidadeano_fatoresrisco", joinColumns =
//            {@JoinColumn(name = "fatorcondutagravidadeano_id")}, inverseJoinColumns =
//            {@JoinColumn(name = "fatoresrisco_id")})
    private Set<FatorRisco> fatoresRisco;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
//    @JoinTable(name = "fatorcondutagravidadeano_fatoresgravidade", joinColumns =
//            {@JoinColumn(name = "fatorcondutagravidadeano_id")}, inverseJoinColumns =
//            {@JoinColumn(name = "fatoresgravidade_id")})
    private Set<FatorGravidade> fatoresGravidade;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
//    @JoinTable(name = "fatorcondutagravidadeano_condutasrisco", joinColumns =
//            {@JoinColumn(name = "fatorcondutagravidadeano_id")}, inverseJoinColumns =
//            {@JoinColumn(name = "condutarisco_id")})
    private Set<CondutaRisco> condutasRisco;

    public FatorCondutaGravidadeAno() {
    }

    public FatorCondutaGravidadeAno(Ano ano, Set<FatorRisco> fatoresRisco, Set<FatorGravidade> fatoresGravidade, Set<CondutaRisco> condutasRisco) {
        this.ano = ano;
        this.fatoresRisco = fatoresRisco;
        this.fatoresGravidade = fatoresGravidade;
        this.condutasRisco = condutasRisco;


    }
}
