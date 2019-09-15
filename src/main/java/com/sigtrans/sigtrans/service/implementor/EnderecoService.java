package com.sigtrans.sigtrans.service.implementor;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.estado.EstadoNotFoundException;
import com.sigtrans.sigtrans.model.endereco.estado.EstadoResourceAssembler;
import com.sigtrans.sigtrans.repository.EstadoRepository;
import com.sigtrans.sigtrans.repository.MunicipioRepository;
import com.sigtrans.sigtrans.service.interfac.IEnderecoService;
import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class EnderecoService implements IEnderecoService {
    public final EstadoRepository estadoRepository;
    public final MunicipioRepository municipioRepository;
    private final EstadoResourceAssembler stateAssembler;

    public EnderecoService(EstadoRepository estadoRepository, MunicipioRepository municipioRepository, EstadoResourceAssembler stateAssembler) {
        this.estadoRepository = estadoRepository;
        this.municipioRepository = municipioRepository;
        this.stateAssembler = stateAssembler;
    }

    public Set<Resource<Estado>> FindAllStates() {
        return estadoRepository.findAll().stream().map(stateAssembler::toResource).collect(Collectors.toSet());
    }

    public Resource<Estado> FindState(Long id) {
        Estado state = estadoRepository.findById(id)
                .orElseThrow(() -> new EstadoNotFoundException(id));
        return stateAssembler.toResource(state);
    }
}
