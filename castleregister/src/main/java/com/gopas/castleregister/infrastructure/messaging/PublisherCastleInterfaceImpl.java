package com.gopas.castleregister.infrastructure.messaging;

import com.gopas.castleregister.application.event.ExternalCastleCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by macalaki on 31.01.2017.
 */

@Service
public class PublisherCastleInterfaceImpl implements PublisherCastleInterface {
    @Autowired
    private MessageChanelInterface publisher;

    @Override
    public void sendCastleCreatedEvent(ExternalCastleCreatedEvent event) {
        publisher.sendCastleCreatedEvent().send(
                MessageBuilder.withPayload(event)
                        .setHeader("SOME_HEADER", "value")
                        .build());
    }
}
