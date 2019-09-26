package com.gopas.castleregister.domain.event;

public class CastleCreatedEvent {
    public String id;
    public String name;
    public String ownerId;
    public Double longitude;
    public Double latitude;
    public String description;
    public String address;
    public String webPage;
    public String foto;
    public Integer capacity;

    public CastleCreatedEvent() {
    }

    public CastleCreatedEvent(String id, String name, String ownerId, Double longitude,
                              Double latitude, String description, String address,
                              String webPage, String foto, Integer capacity) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
        this.address = address;
        this.webPage = webPage;
        this.foto = foto;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CastleCreatedEvent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", webPage='" + webPage + '\'' +
                ", foto='" + foto + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
