package com.gopas.castleregister.domain.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Castle {

    private @Id
    UUID id;
    private String name;

    @Embedded
    private CastleLocation castleLocation;

    @OneToOne
    private Owner owner;

    @OneToMany(mappedBy = "castle")
    private List<CastleRoute> castleRoutes = new ArrayList<>();
    private String description;
    private String photo;
    private String address;
    private String webPage;
    private Integer capacity;

    @Transient
    private CastleRepository castleRepository;

    @Transient
    private CastleRouteRepository castleRouteRepository;

    public Castle() {

    }

    public Castle(UUID id, String name) {
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

    public CastleLocation getCastleLocation() {
        return castleLocation;
    }

    public void setCastleLocation(CastleLocation castleLocation) {
        this.castleLocation = castleLocation;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<CastleRoute> getCastleRoutes() {
        return castleRoutes;
    }

    public void setCastleRoutes(List<CastleRoute> castleRoutes) {
        this.castleRoutes = castleRoutes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public CastleRepository getCastleRepository() {
        return castleRepository;
    }

    public void setCastleRepository(CastleRepository castleRepository) {
        this.castleRepository = castleRepository;
    }

    public CastleRouteRepository getCastleRouteRepository() {
        return castleRouteRepository;
    }

    public void setCastleRouteRepository(CastleRouteRepository castleRouteRepository) {
        this.castleRouteRepository = castleRouteRepository;
    }

    public void addRoute(CastleRoute castleRoute) {

        if (castleRoute == null) {
            return;
        }

        this.castleRoutes.add(castleRoute);
        castleRoute.setCastle(this);
        this.castleRouteRepository.createCastleRoute(castleRoute);

    }
}
