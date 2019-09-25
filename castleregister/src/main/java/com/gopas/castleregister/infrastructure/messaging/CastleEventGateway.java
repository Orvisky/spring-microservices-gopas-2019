package com.gopas.castleregister.infrastructure.messaging;

import com.gopas.castleregister.application.event.ExternalCastleCreatedEvent;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * Created by macalaki on 31.01.2017.
 */
@MessagingGateway
public interface CastleEventGateway {

    @Gateway(requestChannel = MessageChanelInterface.CASTLE_SOURCE)
    void sendCastleCreatedEvent(ExternalCastleCreatedEvent event);
}
