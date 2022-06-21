package com.flagcamp.travelplanner.entity;

import java.util.List;
import java.util.UUID;

public class Tripday {
    UUID uuid;
    private String daytime;
    private List<Place> places;
    private String weather;

    public Tripday() {
        uuid = UUID.randomUUID();
    }

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