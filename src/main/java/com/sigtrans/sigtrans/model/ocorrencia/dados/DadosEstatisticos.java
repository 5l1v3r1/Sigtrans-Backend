package com.sigtrans.sigtrans.model.ocorrencia.dados;

import com.sigtrans.sigtrans.model.ocorrencia.via.Via;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class DadosEstatisticos {
    @Column(name = "zona")
    private String zona;

    @ManyToOne
    private AcidenteTrabalho acidenteTrabalho;

    @ManyToOne
    private TipoAcidente tipoAcidente;

    @Column(name = "tipo_acidente_original")
    private String tipoAcidenteOriginal;

    @ManyToOne
    private ClassificacaoAcidente classificacaoAcidente;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Via> vias;

    public DadosEstatisticos() {
    }

    public DadosEstatisticos(String zona, AcidenteTrabalho acidenteTrabalho, TipoAcidente tipoAcidente, String tipoAcidenteOriginal, ClassificacaoAcidente classificacaoAcidente, Set<Via> vias) {
        this.zona = zona;
        this.acidenteTrabalho = acidenteTrabalho;
        this.tipoAcidente = tipoAcidente;
        this.tipoAcidenteOriginal = tipoAcidenteOriginal;
        this.classificacaoAcidente = classificacaoAcidente;
        this.vias = vias;

    }
}
