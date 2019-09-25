package com.gopas.castlereservation;

import com.gopas.castlereservation.infrastructure.messaging.SubscriberCastleInterface;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(SubscriberCastleInterface.class)
public class MessageChanelConfiguration {
	

}
