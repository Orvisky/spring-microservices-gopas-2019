package com.gopas.castleregister.domain.model;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.UUID;

public class CastleTests {

    @Test
    public void addCastleRouteToCastle() {

        Castle castle = new Castle(UUID.randomUUID(), "Krasna horka");
        CastleRoute castleRoute = new CastleRoute(UUID.randomUUID(), "Juzna trasa");
        castle.setCastleRepository(Mockito.mock(CastleRepository.class));
        castle.setCastleRouteRepository(Mockito.mock(CastleRouteRepository.class));

        castle.addRoute(castleRoute);

    }

    @Test
    public void addCastleRouteToCastleNull() {

        Castle castle = new Castle(UUID.randomUUID(), "Krasna horka");
        CastleRoute castleRoute = new CastleRoute(UUID.randomUUID(), "Juzna trasa");
        castle.setCastleRepository(Mockito.mock(CastleRepository.class));
        castle.setCastleRouteRepository(Mockito.mock(CastleRouteRepository.class));

        castle.addRoute(null);

    }
}
