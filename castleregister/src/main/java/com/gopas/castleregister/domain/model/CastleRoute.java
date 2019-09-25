package com.gopas.castleregister.domain.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CastleRoute {
    private @Id
    UUID id;

    private String name;
    private Integer capacity;

    @Embedded
    private OpeningHours openingHours;

    @ManyToOne
    @JoinColumn(name = "castle_id")
    private Castle castle;

    public CastleRoute() {
        
    }

    public CastleRoute(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }
}
