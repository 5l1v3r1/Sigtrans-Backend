package com.sigtrans.sigtrans.controller;

import com.sigtrans.sigtrans.controller.assemblers.EnderecoResourceAssembler;
import com.sigtrans.sigtrans.model.endereco.rua.Rua;
import com.sigtrans.sigtrans.model.endereco.bairro.Bairro;
import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import com.sigtrans.sigtrans.service.implementor.EnderecoService;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService service;
    private final EnderecoResourceAssembler enderecoResourceAssembler;

    public EnderecoController(EnderecoService service, EnderecoResourceAssembler enderecoResourceAssembler) {
        this.service = service;
        this.enderecoResourceAssembler = enderecoResourceAssembler;
    }

    @GetMapping("/estado")
    public Resources allStates() {
        Set<Resource<Estado>> states = service.FindAllStates().stream().map(enderecoResourceAssembler.stateAssembler::toResource).collect(Collectors.toSet());
        return new Resources<>(Collections.singleton(states), linkTo(methodOn(EnderecoController.class).allStates()).withSelfRel());
    }

    @GetMapping("/estado/{id}")
    public Resource<Estado> oneState(@PathVariable UUID id) {
        Estado state = service.FindStateById(id);
        return enderecoResourceAssembler.stateAssembler.toResource(state);
    }

    @GetMapping("/municipio")
    public Resources allCities() {
        Set<Resource<Municipio>> cities = service.FindAllCities().stream().map(enderecoResourceAssembler.cityAssembler::toResource).collect(Collectors.toSet());
        return new Resources<>(Collections.singleton(cities), linkTo(methodOn(EnderecoController.class).allCities()).withSelfRel());
    }

    @GetMapping("/municipio/{id}")
    public Resource<Municipio> oneCity(@PathVariable UUID id) {
        Municipio city = service.FindCityById(id);
        return enderecoResourceAssembler.cityAssembler.toResource(city);
    }

    @GetMapping("/bairro")
    public Resources allDistricts() {
        Set<Resource<Bairro>> districts = service.FindAllDistricts().stream().map(enderecoResourceAssembler.districtAssembler::toResource).collect(Collectors.toSet());
        return new Resources<>(Collections.singleton(districts), linkTo(methodOn(EnderecoController.class).allCities()).withSelfRel());
    }

    @GetMapping("/bairro/{id}")
    public Resource<Bairro> oneDistrict(@PathVariable UUID id) {
        Bairro district = service.FindDistrictById(id);
        return enderecoResourceAssembler.districtAssembler.toResource(district);
    }

    @GetMapping("/rua")
    public Resources allStreets() {
        Set<Resource<Rua>> streets = service.FindAllStreets().stream().map(enderecoResourceAssembler.streetAssembler::toResource).collect(Collectors.toSet());
        return new Resources<>(Collections.singleton(streets), linkTo(methodOn(EnderecoController.class).allCities()).withSelfRel());
    }

    @GetMapping("/rua/{id}")
    public Resource<Rua> oneStreet(@PathVariable UUID id) {
        Rua street = service.FindStreetById(id);
        return enderecoResourceAssembler.streetAssembler.toResource(street);
    }

}
