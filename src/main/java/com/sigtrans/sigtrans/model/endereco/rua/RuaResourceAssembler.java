package com.sigtrans.sigtrans.model.endereco.rua;

import com.sigtrans.sigtrans.controller.EnderecoController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class RuaResourceAssembler implements ResourceAssembler<Rua, Resource<Rua>> {
    @Override
    public Resource<Rua> toResource(Rua state) {
        return new Resource<>(state,
                linkTo(methodOn(EnderecoController.class).oneStreet(state.getId())).withSelfRel(),
                linkTo(methodOn(EnderecoController.class).allStreets()).withRel("streets"));
    }
}