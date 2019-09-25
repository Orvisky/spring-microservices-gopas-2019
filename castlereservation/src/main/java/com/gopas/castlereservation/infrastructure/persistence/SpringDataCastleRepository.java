package com.gopas.castlereservation.infrastructure.persistence;

import com.gopas.castlereservation.domain.model.Castle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SpringDataCastleRepository extends JpaRepository<Castle, UUID> {
    List<Castle> findByName(String name);
}
