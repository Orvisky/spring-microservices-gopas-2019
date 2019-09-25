package com.gopas.castleregister.domain.model;

import javax.persistence.Embeddable;
import java.time.Instant;

@Embeddable
public class OpeningHours {
    private Instant openFrom;
    private Instant openTo;

    public OpeningHours() {

    }

    public OpeningHours(Instant from, Instant to) {
        this.openFrom = from;
        this.openTo = to;
    }

    public Instant getOpenFrom() {
        return openFrom;
    }

    public Instant getOpenTo() {
        return openTo;
    }

    @Override
    public String toString() {
        return "OpeningHours{" +
                "openFrom=" + openFrom +
                ", openTo=" + openTo +
                '}';
    }
}
