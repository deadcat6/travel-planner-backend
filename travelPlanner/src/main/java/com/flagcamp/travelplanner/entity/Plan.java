package com.flagcamp.travelplanner.entity;

import java.util.List;
import java.util.UUID;

public class Plan {
    UUID uuid;
    private String title;
    private User owner;
    private List<Tripday> days;
    private List<String> tags;
    private int likes;

    public Plan(String title){
        uuid = UUID.randomUUID();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Tripday> getDays() {
        return days;
    }

    public void setDays(List<Tripday> days) {
        this.days = days;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
