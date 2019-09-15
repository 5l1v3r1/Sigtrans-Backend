package com.sigtrans.sigtrans.repository;

import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MunicipioRepository extends JpaRepository<Municipio, UUID> {
}
