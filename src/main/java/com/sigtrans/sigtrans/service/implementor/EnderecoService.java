package com.sigtrans.sigtrans.service.implementor;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.estado.EstadoNotFoundException;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import com.sigtrans.sigtrans.model.endereco.municipio.MunicipioNotFoundException;
import com.sigtrans.sigtrans.repository.EstadoRepository;
import com.sigtrans.sigtrans.repository.MunicipioRepository;
import com.sigtrans.sigtrans.service.interfac.IEnderecoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoService implements IEnderecoService {
    private final EstadoRepository estadoRepository;
    private final MunicipioRepository municipioRepository;

    public EnderecoService(EstadoRepository estadoRepository, MunicipioRepository municipioRepository) {
        this.estadoRepository = estadoRepository;
        this.municipioRepository = municipioRepository;
    }

    public List<Estado> FindAllStates() {
        return estadoRepository.findAll();
    }

    public Estado FindState(Long id) {
        return estadoRepository.findById(id).orElseThrow(() -> new EstadoNotFoundException(id));
    }

    public List<Municipio> FindAllCities() {
        return municipioRepository.findAll();
    }

    public Municipio FindCity(Long id) {
        return municipioRepository.findById(id).orElseThrow(() -> new MunicipioNotFoundException(id));
    }
}
