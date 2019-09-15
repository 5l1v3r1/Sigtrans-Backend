package com.sigtrans.sigtrans.model.endereco.bairro;

import com.sigtrans.sigtrans.controller.EnderecoController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class BairroResourceAssembler implements ResourceAssembler<Bairro, Resource<Bairro>> {
    @Override
    public Resource<Bairro> toResource(Bairro state) {

        return new Resource<>(state,
                linkTo(methodOn(EnderecoController.class).oneDistrict(state.getId())).withSelfRel(),
                linkTo(methodOn(EnderecoController.class).allDistricts()).withRel("districts"));
    }
}