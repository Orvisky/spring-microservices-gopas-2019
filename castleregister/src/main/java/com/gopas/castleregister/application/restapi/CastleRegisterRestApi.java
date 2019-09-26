package com.gopas.castleregister.application.restapi;

import com.gopas.castleregister.application.event.ExternalCastleCreatedEvent;
import com.gopas.castleregister.domain.model.*;
import com.gopas.castleregister.infrastructure.messaging.CastleEventGateway;
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
    private CastleRepository castleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    CastleEventGateway castleEventGateway;

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

    @RequestMapping(path = "/castle", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity createCastle(@RequestBody @NotNull @Valid CastleDTO castleDTO) {
        Castle castle = new Castle(
                UUID.fromString(castleDTO.id),
                castleDTO.name
        );

        castle.setAddress(castleDTO.address);
        castle.setCapacity(castleDTO.capacity);
        castle.setCastleLocation(new CastleLocation(castleDTO.lat, castleDTO.lon));
        castle.setCastleRoutes(null);
        castle.setDescription(castleDTO.description);

        castleRepository.createCastle(castle);

        castleEventGateway.sendCastleCreatedEvent(
                modelMapper.map(castleDTO, ExternalCastleCreatedEvent.class)
        );

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    /*
    @RequestMapping(consumes={"application/json"}, value="/castle", method= RequestMethod.POST )
    public ResponseEntity<Void> createCastle(@RequestBody @NotNull @Valid CastleDTO castleDTO){
        Castle castle = new Castle(UUID.fromString(castleDTO.id),
                castleDTO.name,
                new CastleLocation(castleDTO.latitude, castleDTO.longitude),
                castleDTO.description,
                castleDTO.address,
                castleDTO.webPage,
                castleDTO.foto,
                castleDTO.capacity);
        castle.setCastleRepository(castleRepository);
        castle.setDomainEventPublisher(domainEventPublisher);
        castle.create();
//        castleRepository.createCastle(castle);
//        castleEventGateway.sendCastleCreatedEvent(modelMapper.map(castleDTO, ExternalCastleCreatedEvent.class));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    */

}
