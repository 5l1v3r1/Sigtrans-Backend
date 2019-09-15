package com.sigtrans.sigtrans.model.endereco.municipio;

public class MunicipioNotFoundException extends RuntimeException {
    public MunicipioNotFoundException(Long id) {
        super("Não foi possível encontrar o municipio " + id);
    }
}