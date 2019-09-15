package com.sigtrans.sigtrans.service.interfac;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;

import java.util.List;

public interface IEnderecoService {
    List<Estado> FindAllStates();

    List<Municipio> FindAllCities();

    Estado FindState(Long id);

    Municipio FindCity(Long id);
}