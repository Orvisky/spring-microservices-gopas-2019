package com.gopas.castleregister.application.event;

public class ExternalCastleCreatedEvent {
    public  String id;
    public String name;
    public String ownerId;
    public Double lat;
    public Double lon;
    public String description;
    public String address;
    public String photo;
    public String webPage;
    public Integer capacity;

    public ExternalCastleCreatedEvent() {
    }

    public ExternalCastleCreatedEvent(String id, String name, String ownerId, Double lat, Double lon, String description, String address, String photo, String webPage, Integer capacity) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.lat = lat;
        this.lon = lon;
        this.description = description;
        this.address = address;
        this.photo = photo;
        this.webPage = webPage;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ExternalCastleCreatedEvent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", photo='" + photo + '\'' +
                ", webPage='" + webPage + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
