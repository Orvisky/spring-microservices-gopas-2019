package com.gopas.castleregister.domain.event;

public interface DomainEventPublisher {
    void fireEvent(GenericEvent payload);
}
