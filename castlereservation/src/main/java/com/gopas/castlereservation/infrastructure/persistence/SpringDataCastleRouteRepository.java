package com.gopas.castlereservation.infrastructure.persistence;

import com.gopas.castlereservation.domain.model.CastleRoute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SpringDataCastleRouteRepository extends JpaRepository<CastleRoute, UUID> {
    List<CastleRoute> findByName(String name);
}
