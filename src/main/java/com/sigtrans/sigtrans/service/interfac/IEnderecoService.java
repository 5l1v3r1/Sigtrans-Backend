package com.sigtrans.sigtrans.service.interfac;

import com.sigtrans.sigtrans.model.endereco.rua.Rua;
import com.sigtrans.sigtrans.model.endereco.bairro.Bairro;
import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;

import java.util.List;
import java.util.UUID;

public interface IEnderecoService {
    List<Estado> FindAllStates();

    List<Municipio> FindAllCities();

    List<Bairro> FindAllDistricts();

    List<Rua> FindAllStreets();

    Rua FindStreetById(UUID id);

    Bairro FindDistrictById(UUID id);

    Municipio FindCityById(UUID id);

    Estado FindStateById(UUID id);
}