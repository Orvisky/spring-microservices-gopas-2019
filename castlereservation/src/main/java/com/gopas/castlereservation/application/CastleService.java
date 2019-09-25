package com.gopas.castlereservation.application;

import com.gopas.castlereservation.domain.model.Castle;
import com.gopas.castlereservation.domain.model.CastleRepository;
import com.gopas.castlereservation.domain.model.CastleRoute;
import com.gopas.castlereservation.domain.model.CastleRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class CastleService {

    @Autowired
    private CastleRepository castleRepository;

    @Autowired
    private CastleRouteRepository castleRouteRepository;

    @Transactional
    public void addRouteToCastle(Castle castle, CastleRoute castleRoute) {
        castle.setCastleRepository(this.castleRepository);
        castle.setCastleRouteRepository(this.castleRouteRepository);
        castle.addRoute(castleRoute);
    }
}
