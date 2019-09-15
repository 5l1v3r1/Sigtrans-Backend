package com.sigtrans.sigtrans.service.interfac;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;

import java.util.List;
import java.util.UUID;

public interface IEnderecoService {
    List<Estado> FindAllStates();

    List<Municipio> FindAllCities();

    Estado FindStateById(UUID id);

    Municipio FindCityById(UUID id);
}