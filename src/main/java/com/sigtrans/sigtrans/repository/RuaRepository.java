package com.sigtrans.sigtrans.repository;

import com.sigtrans.sigtrans.model.endereco.rua.Rua;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RuaRepository extends JpaRepository<Rua, UUID> {
}
