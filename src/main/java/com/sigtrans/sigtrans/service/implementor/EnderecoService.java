package com.sigtrans.sigtrans.service.implementor;

import com.sigtrans.sigtrans.model.assemblers.EstadoResourceAssembler;
import com.sigtrans.sigtrans.model.estado.Estado;
import com.sigtrans.sigtrans.repository.EstadoRepository;
import com.sigtrans.sigtrans.service.interfac.IEnderecoService;
import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class EnderecoService implements IEnderecoService {
    public final EstadoRepository estadoRepository;
    private final EstadoResourceAssembler stateAssembler;

    public EnderecoService(EstadoRepository estadoRepository, EstadoResourceAssembler stateAssembler) {
        this.estadoRepository = estadoRepository;
        this.stateAssembler = stateAssembler;
    }

    public Set<Resource<Estado>> FindAllStates() {
        return estadoRepository.findAll().stream().map(stateAssembler::toResource).collect(Collectors.toSet());
    }
}
