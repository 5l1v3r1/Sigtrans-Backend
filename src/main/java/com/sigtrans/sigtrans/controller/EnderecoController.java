package com.sigtrans.sigtrans.controller;

import com.sigtrans.sigtrans.model.endereco.Estado;
import com.sigtrans.sigtrans.service.implementor.EnderecoService;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class EnderecoController {

    private final EnderecoService service;

    public EnderecoController(EnderecoService service) {
        this.service = service;
    }

    // Aggregate root

    @GetMapping("/endereco/estado")
    Resources<Resource<Estado>> all() {
        Set<Resource<Estado>> states = service.FindAllStates();

        return new Resources<>(states, linkTo(methodOn(EnderecoController.class).all()).withSelfRel());
    }

    @PostMapping("/endereco/estado")
    ResponseEntity<?> newEstado(@RequestBody Estado newEstado) throws URISyntaxException {
        Resource<Estado> resource = assembler.toResource(service.estadoRepository.save(newEstado));
        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }

    // Single item

    @GetMapping("/endereco/estado/{id}")
    Resource<Estado> one(@PathVariable Long id) {

        Estado employee = service.estadoRepository.findById(id)
                .orElseThrow(() -> new EstadoNotFoundException(id));

        return assembler.toResource(employee);
    }

    @PutMapping("/endereco/estado/{id}")
    ResponseEntity<?> replaceEstado(@RequestBody Estado newEstado,
                                    @PathVariable Long id) throws URISyntaxException {

        Estado updatedEstado = service.estadoRepository.findById(id)
                .map(employee -> {
                    employee.setName(newEstado.getName());
                    employee.setRole(newEstado.getRole());
                    return service.estadoRepository.save(employee);
                })
                .orElseGet(() -> {
                    newEstado.setId(id);
                    return service.estadoRepository.save(newEstado);
                });
        Resource<Estado> resource = assembler.toResource(updatedEstado);
        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }

    @DeleteMapping("/employees/{id}")
    ResponseEntity<?> deleteEstado(@PathVariable Long id) {
        service.estadoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
