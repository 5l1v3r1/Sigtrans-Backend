package com.sigtrans.sigtrans.controller;

import com.sigtrans.sigtrans.model.endereco.estado.EstadoResourceAssembler;
import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import com.sigtrans.sigtrans.model.endereco.municipio.MunicipioResourceAssembler;
import com.sigtrans.sigtrans.service.implementor.EnderecoService;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService service;
    private final EstadoResourceAssembler stateAssembler;
    private final MunicipioResourceAssembler cityAssembler;

    public EnderecoController(EnderecoService service, EstadoResourceAssembler stateAssembler, MunicipioResourceAssembler cityAssembler) {
        this.service = service;
        this.stateAssembler = stateAssembler;
        this.cityAssembler = cityAssembler;
    }

    @GetMapping("/estado")
    public Resources allStates() {
        Set<Resource<Estado>> states = service.FindAllStates().stream().map(stateAssembler::toResource).collect(Collectors.toSet());
        return new Resources<>(Collections.singleton(states), linkTo(methodOn(EnderecoController.class).allStates()).withSelfRel());
    }

    @GetMapping("/estado/{id}")
    public Resource<Estado> oneState(@PathVariable Long id) {
        Estado state = service.FindState(id);
        return stateAssembler.toResource(state);
    }

    @GetMapping("/municipio")
    public Resources allCities() {
        Set<Resource<Municipio>> cities = service.FindAllCities().stream().map(cityAssembler::toResource).collect(Collectors.toSet());
        return new Resources<>(Collections.singleton(cities), linkTo(methodOn(EnderecoController.class).allCities()).withSelfRel());
    }

    // Single item
    @GetMapping("/municipio/{id}")
    public Resource<Municipio> oneCity(@PathVariable Long id) {
        Municipio city = service.FindCity(id);
        return cityAssembler.toResource(city);
    }

}
