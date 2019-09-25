package com.gopas.castlereservation.domain.model;

import javax.persistence.Embeddable;

@Embeddable
public class CastleLocation {
    private Double lat;
    private Double lon;

    public CastleLocation() {

    }

    public CastleLocation(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    @Override
    public String toString() {
        return "CastleLocation{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
