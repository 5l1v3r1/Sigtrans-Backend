package com.sigtrans.sigtrans.model.ocorrencia.via;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data
@Entity
public class Via {

      @Column(name = "faixas")
    private int faixas;

    @Column(name = "velocidade_maxima")
    private int velocidadeMaxima;

    @ManyToOne
    private TipoVia tipoVia;

    @ManyToOne
    private Pavimentacao pavimentacao;

    @ManyToOne
    private ConservacaoVia conservacaoVia;

    @ManyToOne
    private SentidoVia sentidoVia;

    @ManyToOne
    private Semaforo semaforo;

    @ManyToOne
    private PerfilPista perfilPista;

    @ManyToOne
    private Superficie superficie;

    @ManyToOne
    private CondicoesClimaticas condicoesClimaticas;

    @ManyToOne
    private EquipamentoControleTrafego equipamentoControleTrafego;

    @ManyToOne
    private SeparacaoPista separacaoPista;

    @ManyToOne
    private Visibilidade visibilidade;

    @ManyToOne
    private CondicaoTecnica condicaoTecnica;

    @ManyToOne
    private Acostamento acostamento;

    @ManyToOne
    private Sinalizacao sinalizacao;

    @ManyToOne
    private SinaisPneus sinaisPneus;

    public Via(int faixas, int velocidadeMaxima, TipoVia tipoVia, Pavimentacao pavimentacao, ConservacaoVia conservacaoVia, SentidoVia sentidoVia, Semaforo semaforo, PerfilPista perfilPista, Superficie superficie, CondicoesClimaticas condicoesClimaticas, EquipamentoControleTrafego equipamentoControleTrafego, SeparacaoPista separacaoPista, Visibilidade visibilidade, CondicaoTecnica condicaoTecnica, Acostamento acostamento, Sinalizacao sinalizacao, SinaisPneus sinaisPneus) {
        this.faixas = faixas;
        this.velocidadeMaxima = velocidadeMaxima;
        this.tipoVia = tipoVia;
        this.pavimentacao = pavimentacao;
        this.conservacaoVia = conservacaoVia;
        this.sentidoVia = sentidoVia;
        this.semaforo = semaforo;
        this.perfilPista = perfilPista;
        this.superficie = superficie;
        this.condicoesClimaticas = condicoesClimaticas;
        this.equipamentoControleTrafego = equipamentoControleTrafego;
        this.separacaoPista = separacaoPista;
        this.visibilidade = visibilidade;
        this.condicaoTecnica = condicaoTecnica;
        this.acostamento = acostamento;
        this.sinalizacao = sinalizacao;
        this.sinaisPneus = sinaisPneus;
    }

    public Via() {
    }
}


