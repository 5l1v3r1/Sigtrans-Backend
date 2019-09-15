package com.sigtrans.sigtrans.repository;

import com.sigtrans.sigtrans.model.endereco.bairro.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BairroRepository extends JpaRepository<Bairro, UUID> {
}
