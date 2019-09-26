package com.gopas.castleregister.application.restapi;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CastleDTO {

    @NotNull
    public  String id;

    @Size(min = 6)
    public String name;
    public String ownerId;
    public Double lat;
    public Double lon;
    public String description;
    public String address;
    public String photo;
    public String webPage;
    public Integer capacity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CastleDTO{" +
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
