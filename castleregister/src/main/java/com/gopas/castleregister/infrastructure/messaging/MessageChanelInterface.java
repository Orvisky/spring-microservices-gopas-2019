package com.gopas.castleregister.infrastructure.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by macalaki on 31.01.2017.
 */
public interface MessageChanelInterface {

    String CASTLE_SOURCE = "castleregister-source";

    @Output(CASTLE_SOURCE)
    MessageChannel sendCastleCreatedEvent();

}
