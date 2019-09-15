package com.sigtrans.sigtrans.repository;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioRepository extends JpaRepository<Estado, Long> {
}
