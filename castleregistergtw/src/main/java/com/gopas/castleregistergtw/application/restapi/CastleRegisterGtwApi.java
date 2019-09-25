package com.gopas.castleregistergtw.application.restapi;

import com.gopas.castleregister.application.restapi.OwnerDTO;
import com.gopas.castleregistergtw.service.CastleRegisterFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(path = "/api-castleregister")
public class CastleRegisterGtwApi {

    @Autowired
    private CastleRegisterFeignClient castleRegisterFeignClient;

    @RequestMapping(path = "/owner", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity createOwner(@RequestBody @NotNull @Valid OwnerDTO ownerDTO) {
        return castleRegisterFeignClient.createOwner(ownerDTO);
    }

    @HystrixCommand(fallbackMethod = "getOwnerFallback")
    @RequestMapping(path = "/owner/{id}", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
    public OwnerDTO getOwner(@PathVariable("id") String id) {
        return castleRegisterFeignClient.getOwner(id);
    }

    private OwnerDTO getOwnerFallback(String id) {
        OwnerDTO ownerDTO = new OwnerDTO();
        ownerDTO.id = "default";
        ownerDTO.name = "default";
        return ownerDTO;
    }

}
