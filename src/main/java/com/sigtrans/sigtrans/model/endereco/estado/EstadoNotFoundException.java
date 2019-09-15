package com.sigtrans.sigtrans.model.endereco.estado;

public class EstadoNotFoundException extends RuntimeException {
    public EstadoNotFoundException(Long id) {
        super("Could not find state " + id);
    }
}