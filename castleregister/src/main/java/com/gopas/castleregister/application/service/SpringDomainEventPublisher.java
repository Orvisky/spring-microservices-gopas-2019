package com.gopas.castleregister.application.service;

import com.gopas.castleregister.domain.event.DomainEventPublisher;
import com.gopas.castleregister.domain.event.GenericEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringDomainEventPublisher implements DomainEventPublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void fireEvent(GenericEvent payload) {
        applicationEventPublisher.publishEvent(payload);
    }
}
