package com.sigtrans.sigtrans.repository;

import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EstadoRepository extends JpaRepository<Estado, UUID> {
}
