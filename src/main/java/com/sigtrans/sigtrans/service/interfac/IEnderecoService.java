package com.sigtrans.sigtrans.service.interfac;

import com.sigtrans.sigtrans.model.estado.Estado;
import org.springframework.hateoas.Resource;

import java.util.Set;

public interface IEnderecoService {
    Set<Resource<Estado>> FindAllStates();
}