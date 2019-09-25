package com.gopas.castleregistergtw.service;

import com.gopas.castleregister.application.restapi.OwnerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@FeignClient("castleregister")
public interface CastleRegisterFeignClient {

    @RequestMapping(path = "/owner", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    ResponseEntity createOwner(@RequestBody @NotNull @Valid OwnerDTO ownerDTO);

    @RequestMapping(path = "/owner/{id}", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
    OwnerDTO getOwner(@PathVariable("id") String id);
}
