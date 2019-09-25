package com.gopas.castleregister.infrastructure.persistence;

import com.gopas.castleregister.domain.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SpringDataOwnerRepository extends JpaRepository<Owner, UUID> {
    List<Owner> findByName(String name);
}
