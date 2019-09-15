package com.sigtrans.sigtrans.model.endereco.bairro;

import java.util.UUID;

public class BairroNotFoundException extends RuntimeException {
    public BairroNotFoundException(UUID id) {
        super("Não foi possível encontrar o Bairro  " + id.toString());
    }
}