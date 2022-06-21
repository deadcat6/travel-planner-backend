package com.flagcamp.travelplanner.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Visit {
    UUID uuid;
    UUID place_id;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<String> notes;

    public Visit(UUID place_id) {
        uuid = UUID.randomUUID();
        this.place_id = place_id;
    }

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

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }
}
