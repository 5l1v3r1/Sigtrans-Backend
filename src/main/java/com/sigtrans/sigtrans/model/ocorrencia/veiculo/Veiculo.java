package com.sigtrans.sigtrans.model.ocorrencia.veiculo;

import com.sigtrans.sigtrans.model.ocorrencia.Envolvido;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Veiculo {

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "numero_ocupantes")
    private int numeroOcupantes;

    @Column(name = "numero_feridos")
    private int numeroFeridos;

    @Column(name = "numero_obitos")
    private int numeroObitos;

    @ManyToOne
    private CategoriaVeiculo categoria;

    @Column(name = "placa")
    private String placa;

    @ManyToOne
    private Envolvido condutor;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int numeroOcupantes, int numeroFeridos, int numeroObitos, CategoriaVeiculo categoria, String placa, Envolvido condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroOcupantes = numeroOcupantes;
        this.numeroFeridos = numeroFeridos;
        this.numeroObitos = numeroObitos;
        this.categoria = categoria;
        this.placa = placa;
        this.condutor = condutor;

    }
}
