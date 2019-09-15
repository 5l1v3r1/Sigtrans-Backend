package com.sigtrans.sigtrans.model.endereco.municipio;

import java.util.UUID;

public class MunicipioNotFoundException extends RuntimeException {
    public MunicipioNotFoundException(UUID id) {
        super("Não foi possível encontrar o municipio " + id.toString());
    }
}