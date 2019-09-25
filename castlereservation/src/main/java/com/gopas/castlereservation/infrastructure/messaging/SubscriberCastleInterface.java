package com.gopas.castlereservation.infrastructure.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SubscriberCastleInterface {
	String CASTLE_SINK = "castleregister-sink";

	@Input(CASTLE_SINK)
	SubscribableChannel receiveCastleEvent();
}
