package com.gopas.castlereservation.domain.model;

import java.util.List;
import java.util.UUID;

public interface CastleRepository {
    Castle createCastle(Castle castle);
    Castle updateCastle(Castle castle);
    void deleteCastle(UUID id);
    List<Castle> findByName(String name);
    Castle findById(UUID id);
    List<Castle> findByLocation(CastleLocation castleLocation, Double radius);
}
