package com.gopas.castlereservation.infrastructure.persistence;

import com.gopas.castlereservation.domain.model.Castle;
import com.gopas.castlereservation.domain.model.CastleLocation;
import com.gopas.castlereservation.domain.model.CastleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JpaCastleRepository implements CastleRepository {

    @Autowired
    SpringDataCastleRepository springDataCastleRepository;

    @Override
    public Castle createCastle(Castle castle) {
        return springDataCastleRepository.save(castle);
    }

    @Override
    public Castle updateCastle(Castle castle) {
        return springDataCastleRepository.save(castle);
    }

    @Override
    public void deleteCastle(UUID id) {
        springDataCastleRepository.deleteById(id);

    }

    @Override
    public List<Castle> findByName(String name) {
        return springDataCastleRepository.findByName(name);
    }

    @Override
    public Castle findById(UUID id) {
        return springDataCastleRepository.findById(id).orElse(null);
    }

    // TODO: 24.09.2019 findByLocation
    @Override
    public List<Castle> findByLocation(CastleLocation castleLocation, Double radius) {
        return springDataCastleRepository.findAll();
    }
}
