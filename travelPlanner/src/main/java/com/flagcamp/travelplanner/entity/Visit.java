package com.flagcamp.travelplanner.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class Visit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    UUID uuid;

    UUID place_id;
    private LocalDateTime start;
    private LocalDateTime end;
    private String note;

//    public Visit(UUID place_id) {
//        uuid = UUID.randomUUID();
//        this.place_id = place_id;
//    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
