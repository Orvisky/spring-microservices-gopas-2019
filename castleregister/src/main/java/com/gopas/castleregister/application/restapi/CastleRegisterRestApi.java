package com.gopas.castleregister.application.restapi;

import com.gopas.castleregister.domain.model.Owner;
import com.gopas.castleregister.domain.model.OwnerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequestMapping(path = "/")
public class CastleRegisterRestApi {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(path = "/owner", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity createOwner(@RequestBody @NotNull @Valid OwnerDTO ownerDTO) {
        Owner owner = new Owner(
                UUID.fromString(ownerDTO.id),
                ownerDTO.name
        );
        ownerRepository.createOwner(owner);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @RequestMapping(path = "/owner/{id}", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
    public OwnerDTO getOwner(@PathVariable String id) {
        return modelMapper.map(ownerRepository.findById(UUID.fromString(id)), OwnerDTO.class);
    }

}
