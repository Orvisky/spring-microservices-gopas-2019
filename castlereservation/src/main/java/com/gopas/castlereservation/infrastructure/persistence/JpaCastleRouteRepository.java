package com.gopas.castlereservation.infrastructure.persistence;

import com.gopas.castlereservation.domain.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JpaCastleRouteRepository implements CastleRouteRepository {

    @Autowired
    SpringDataCastleRouteRepository springDataCastleRouteRepository;

    @Override
    public CastleRoute createCastleRoute(CastleRoute castleRoute) {
        return springDataCastleRouteRepository.save(castleRoute);
    }

}
