package com.sigtrans.sigtrans.model.endereco.rua;

import java.util.UUID;

public class RuaNotFoundException extends RuntimeException {
    public RuaNotFoundException(UUID id) {
        super("Não foi possível encontrar a Rua  " + id.toString());
    }
}