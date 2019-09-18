package com.sigtrans.sigtrans.model.ocorrencia;


import com.sigtrans.sigtrans.model.ocorrencia.dados.DadosEstatisticos;
import com.sigtrans.sigtrans.model.ocorrencia.dados.DadosGerais;
import com.sigtrans.sigtrans.model.ocorrencia.veiculo.Veiculo;
import com.sigtrans.sigtrans.model.usuarios.Parceiro;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Ocorrencia {
    @Embedded
    private DadosGerais dadosGerais;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosestatisticos_id")
    private DadosEstatisticos dadosEstatisticos;

    @OneToOne(cascade = CascadeType.ALL)
    private AnaliseObito analiseObito;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "ocorrencia_has_vitima", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "vitima_id")})
    private Set<Vitima> envolvidos;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "ocorrencia_has_parceiro", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "parceiro_id")})
    private Set<Parceiro> parceiros;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "ocorrencia_has_veiculo", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "veiculo_id")})
    private Set<Veiculo> veiculos;


}

    public Ocorrencia() {
    public
        Ocorrencia(DadosGerais dadosGerais, DadosEstatisticos dadosEstatisticos, AnaliseObito analiseObito, Set < Vitima > envolvidos, Set < Parceiro > parceiros, Set < Veiculo > veiculos)
        {
            this.dadosGerais = dadosGerais;
            this.dadosEstatisticos = dadosEstatisticos;
            this.analiseObito = analiseObito;
            this.envolvidos = envolvidos;
            this.parceiros = parceiros;
            this.veiculos = veiculos;

        }
    }
