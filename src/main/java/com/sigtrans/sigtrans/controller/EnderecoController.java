package com.sigtrans.sigtrans.controller;

import com.sigtrans.sigtrans.model.assemblers.EstadoResourceAssembler;
import com.sigtrans.sigtrans.model.estado.Estado;
import com.sigtrans.sigtrans.model.estado.EstadoNotFoundException;
import com.sigtrans.sigtrans.service.implementor.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class EnderecoController {

    private final EnderecoService service;
    private final EstadoResourceAssembler stateAssembler;

    public EnderecoController(EnderecoService service, EstadoResourceAssembler stateAssembler) {
        this.service = service;
        this.stateAssembler = stateAssembler;
    }

    // Aggregate root
    @GetMapping("/endereco/estado")
    public Resources<Resource<Estado>> allStates() {
        Set<Resource<Estado>> states = service.FindAllStates();
        return new Resources<>(states, linkTo(methodOn(EnderecoController.class).allStates()).withSelfRel());
    }

    // Single item
    @GetMapping("/endereco/estado/{id}")
    public Resource<Estado> oneState(@PathVariable Long id) {
        Estado employee = service.estadoRepository.findById(id)
                .orElseThrow(() -> new EstadoNotFoundException(id));
        return stateAssembler.toResource(employee);
    }

}
