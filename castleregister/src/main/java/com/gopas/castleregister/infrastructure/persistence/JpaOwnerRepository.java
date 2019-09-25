package com.gopas.castleregister.infrastructure.persistence;

import com.gopas.castleregister.domain.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JpaOwnerRepository implements OwnerRepository {

    @Autowired
    SpringDataOwnerRepository springDataOwnerRepository;

    @Override
    public Owner createOwner(Owner owner) {
        return springDataOwnerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return springDataOwnerRepository.save(owner);
    }

    @Override
    public void deleteOwner(UUID id) {
        springDataOwnerRepository.deleteById(id);
    }

    @Override
    public List<Owner> findByName(String name) {
        return springDataOwnerRepository.findByName(name);
    }

    @Override
    public Owner findById(UUID id) {
        return springDataOwnerRepository.findById(id).orElse(null);
    }
}
