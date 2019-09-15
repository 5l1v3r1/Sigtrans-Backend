package com.sigtrans.sigtrans.service.implementor;

import com.sigtrans.sigtrans.model.endereco.rua.Rua;
import com.sigtrans.sigtrans.model.endereco.rua.RuaNotFoundException;
import com.sigtrans.sigtrans.model.endereco.bairro.Bairro;
import com.sigtrans.sigtrans.model.endereco.bairro.BairroNotFoundException;
import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.estado.EstadoNotFoundException;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import com.sigtrans.sigtrans.model.endereco.municipio.MunicipioNotFoundException;
import com.sigtrans.sigtrans.repository.BairroRepository;
import com.sigtrans.sigtrans.repository.EstadoRepository;
import com.sigtrans.sigtrans.repository.MunicipioRepository;
import com.sigtrans.sigtrans.repository.RuaRepository;
import com.sigtrans.sigtrans.service.interfac.IEnderecoService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class EnderecoService implements IEnderecoService {
    private final EstadoRepository stateRepository;
    private final MunicipioRepository cityRepository;
    private final BairroRepository districtRepository;
    private final RuaRepository streetRepository;

    public EnderecoService(EstadoRepository stateRepository, MunicipioRepository cityRepository, BairroRepository districtRepository, RuaRepository streetRepository) {
        this.stateRepository = stateRepository;
        this.cityRepository = cityRepository;
        this.districtRepository = districtRepository;
        this.streetRepository = streetRepository;
    }

    public List<Estado> FindAllStates() {
        return stateRepository.findAll();
    }

    public Estado FindStateById(UUID id) {
        return stateRepository.findById(id).orElseThrow(() -> new EstadoNotFoundException(id));
    }

    public List<Municipio> FindAllCities() {
        return cityRepository.findAll();
    }

    public Municipio FindCityById(UUID id) {
        return cityRepository.findById(id).orElseThrow(() -> new MunicipioNotFoundException(id));
    }

    public List<Bairro> FindAllDistricts() {
        return districtRepository.findAll();
    }

    public Bairro FindDistrictById(UUID id) {
        return districtRepository.findById(id).orElseThrow(() -> new BairroNotFoundException(id));
    }

    public List<Rua> FindAllStreets() {
        return streetRepository.findAll();
    }

    public Rua FindStreetById(UUID id) {
        return streetRepository.findById(id).orElseThrow(() -> new RuaNotFoundException(id));
    }
}
