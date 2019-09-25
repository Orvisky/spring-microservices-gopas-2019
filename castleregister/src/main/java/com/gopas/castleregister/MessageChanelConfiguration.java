package com.gopas.castleregister;

import com.gopas.castleregister.infrastructure.messaging.MessageChanelInterface;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableBinding(MessageChanelInterface.class)
@IntegrationComponentScan
public class MessageChanelConfiguration {
	

}
