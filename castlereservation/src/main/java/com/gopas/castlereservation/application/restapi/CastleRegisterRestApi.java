package com.gopas.castlereservation.application.restapi;

import com.gopas.castleregister.event.ExternalCastleCreatedEvent;
import com.gopas.castlereservation.domain.model.*;
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
    private CastleRepository castleRepository;

    @Autowired
    private ModelMapper modelMapper;


}
