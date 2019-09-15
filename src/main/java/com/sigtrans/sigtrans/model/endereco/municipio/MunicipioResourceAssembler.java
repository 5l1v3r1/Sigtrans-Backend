package com.sigtrans.sigtrans.model.endereco.municipio;

import com.sigtrans.sigtrans.controller.EnderecoController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class MunicipioResourceAssembler implements ResourceAssembler<Municipio, Resource<Municipio>> {
    @Override
    public Resource<Municipio> toResource(Municipio city) {

        return new Resource<>(city,
                linkTo(methodOn(EnderecoController.class).oneCity(city.getId())).withSelfRel(),
                linkTo(methodOn(EnderecoController.class).allCities()).withRel("cities"));
    }
}