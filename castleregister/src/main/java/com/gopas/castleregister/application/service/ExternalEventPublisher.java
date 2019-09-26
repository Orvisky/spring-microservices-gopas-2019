package com.gopas.castleregister.application.service;

import com.gopas.castleregister.application.event.ExternalCastleCreatedEvent;
import com.gopas.castleregister.domain.event.CastleCreatedEvent;
import com.gopas.castleregister.domain.event.GenericEvent;
import com.gopas.castleregister.infrastructure.messaging.CastleEventGateway;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ExternalEventPublisher {
    private final static Logger LOG = LoggerFactory.getLogger(ExternalEventPublisher.class);

    @Autowired
    private CastleEventGateway castleEventGateway;
    @Autowired
    ModelMapper modelMapper;


    @EventListener
    public void handleDomainEvent(GenericEvent event) {
        LOG.info("Domain event {} received.", event.getPayload());
        if(event.getPayload()!= null){
            if(event.getPayload() instanceof CastleCreatedEvent){
                LOG.info("Publishing  ExternalCastleCreatedEvent ...");
                castleEventGateway.sendCastleCreatedEvent(modelMapper.map(event.getPayload(), ExternalCastleCreatedEvent.class));
            }
        }
    }
}
