package com.gopas.castlereservation.infrastructure.messaging;

import com.gopas.castleregister.event.ExternalCastleCreatedEvent;
import com.gopas.castlereservation.domain.model.CastleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class SubscriberCastleImpl {
	final Logger LOG = LoggerFactory.getLogger(SubscriberCastleImpl.class);

	@Autowired
	CastleRepository castleRepository;
	
	@StreamListener(SubscriberCastleInterface.CASTLE_SINK)
	public void receiveCastleCreatedEvent(@NotNull ExternalCastleCreatedEvent event) {
		LOG.info("Event received " + event);
		//Castle castleToAdd = new Castle(UUID.fromString(event.id), event.name);
		//castleRepository.createCastle(castleToAdd);
	}
}
