package com.sigtrans.sigtrans.model.ocorrencia.dados;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import com.sigtrans.sigtrans.model.endereco.rua.Rua;
import com.sigtrans.sigtrans.model.ocorrencia.GrauInstrucao;
import com.sigtrans.sigtrans.model.ocorrencia.veiculo.CondicaoSeguranca;
import com.sigtrans.sigtrans.model.ocorrencia.veiculo.PosicaoVeiculo;
import com.sigtrans.sigtrans.model.ocorrencia.veiculo.Veiculo;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class DadosGerais {
    @Column(name = "nome")
    private String nome;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Municipio municipio;

    @ManyToOne
    private Rua rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "nome_mae")
    private String nomeMae;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private PosicaoVeiculo posicaoVeiculo;

    @ManyToOne
    private CondicaoSeguranca condicaoSeguranca;

    @Column(name = "documento") //RG
    private String documento;

    @Column(name = "orgao_exp")
    private String orgaoExp;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @ManyToOne
    private Estado naturalidade;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nasc")
    private String dataNascimento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "validade_cnh")
    private String validadeCNH;

    @Column(name = "etilometria")
    private Double etilometria;

    @ManyToOne
    private GrauInstrucao grauInstrucao;

    public DadosGerais(String nome, Estado estado, Municipio municipio, Rua rua, String numero, String nomeMae, Veiculo veiculo, PosicaoVeiculo posicaoVeiculo, CondicaoSeguranca condicaoSeguranca, String documento, String orgaoExp, String sexo, String profissao, String nacionalidade, Estado naturalidade, String cpf, String dataNascimento, int idade, String cnh, String validadeCNH, Double etilometria, GrauInstrucao grauInstrucao) {
        this.nome = nome;
        this.estado = estado;
        this.municipio = municipio;
        this.rua = rua;
        this.numero = numero;
        this.nomeMae = nomeMae;
        this.veiculo = veiculo;
        this.posicaoVeiculo = posicaoVeiculo;
        this.condicaoSeguranca = condicaoSeguranca;
        this.documento = documento;
        this.orgaoExp = orgaoExp;
        this.sexo = sexo;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.cnh = cnh;
        this.validadeCNH = validadeCNH;
        this.etilometria = etilometria;
        this.grauInstrucao = grauInstrucao;
    }

    public DadosGerais() {
    }
}

