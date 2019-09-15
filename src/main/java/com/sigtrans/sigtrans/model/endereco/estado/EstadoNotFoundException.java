package com.sigtrans.sigtrans.model.endereco.estado;

import java.util.UUID;

public class EstadoNotFoundException extends RuntimeException {
    public EstadoNotFoundException(UUID id) {
        super("Could not find state " + id.toString());
    }
}