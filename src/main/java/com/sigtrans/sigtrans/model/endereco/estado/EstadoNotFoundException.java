package com.sigtrans.sigtrans.model.endereco.estado;

import java.util.UUID;

public class EstadoNotFoundException extends RuntimeException {
    public EstadoNotFoundException(UUID id) {
        super("Não foi possível encontrar o Estado " + id.toString());
    }
}