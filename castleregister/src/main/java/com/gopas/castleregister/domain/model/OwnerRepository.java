package com.gopas.castleregister.domain.model;

import java.util.List;
import java.util.UUID;

public interface OwnerRepository {
    Owner createOwner(Owner castle);
    Owner updateOwner(Owner castle);
    void deleteOwner(UUID id);
    List<Owner> findByName(String name);
    Owner findById(UUID id);
}
