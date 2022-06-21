package com.flagcamp.travelplanner.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "plan")
public class Plan implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    UUID uuid;

    private String title;

    @ManyToOne
    private User owner;

    @OneToMany
    private List<Tripday> days;

    private String tag;
    private int likes;

//    public Plan(String title){
//          uuid = UUID.randomUUID();
//        this.title = title;
//    }

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
