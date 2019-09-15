package com.sigtrans.sigtrans.model.assemblers;

import com.sigtrans.sigtrans.controller.EnderecoController;
import com.sigtrans.sigtrans.model.estado.Estado;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Component
public class EstadoResourceAssembler implements ResourceAssembler<Estado, Resource<Estado>> {
    @Override
    public Resource<Estado> toResource(Estado state) {

        return new Resource<>(state,
                linkTo(methodOn(EnderecoController.class).oneState(state.getId())).withSelfRel(),
                linkTo(methodOn(EnderecoController.class).allStates()).withRel("employees"));
    }
}