package com.gopas.castleregister.infrastructure.messaging;

import com.gopas.castleregister.application.event.ExternalCastleCreatedEvent;

/**
 * Created by macalaki on 31.01.2017.
 */
public interface PublisherCastleInterface {
    void sendCastleCreatedEvent(ExternalCastleCreatedEvent event);
}
