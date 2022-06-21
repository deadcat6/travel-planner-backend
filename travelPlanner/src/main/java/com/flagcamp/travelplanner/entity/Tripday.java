package com.flagcamp.travelplanner.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
public class Tripday implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    UUID uuid;
    private String daytime;

    @OneToMany
    private List<Place> places;
    private String weather;

//    public Tripday() {
//        uuid = UUID.randomUUID();
//    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}