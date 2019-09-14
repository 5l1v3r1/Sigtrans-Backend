package com.sigtrans.sigtrans.service.implementor;

import com.sigtrans.sigtrans.model.endereco.Estado;
import com.sigtrans.sigtrans.repository.EstadoRepository;
import com.sigtrans.sigtrans.service.interfac.IEnderecoService;
import org.springframework.hateoas.Resource;

import java.util.Set;
import java.util.stream.Collectors;

public class EnderecoService implements IEnderecoService {
    public final EstadoRepository estadoRepository;

    public EnderecoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public Set<Resource<Estado>> FindAllStates(){
        return estadoRepository.findAll().stream()
                .map(assembler::toResource)
                .collect(Collectors.toSet());;
    }


}
