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
}
