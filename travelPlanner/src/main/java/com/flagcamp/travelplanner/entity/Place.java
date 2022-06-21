package com.flagcamp.travelplanner.entity;

import java.util.List;
import java.util.UUID;

public class Place {
    private String placeId;
    private String title;
    private String image;
    private float lat;
    private float lng;
    private String description;
    private float rating;
    private int popularity;
    private List<String> notes;

    public Place(String title) {
        this.title = title;
    }

    public String getplaceId() {
        return placeId;
    }

    public void setplaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }
}