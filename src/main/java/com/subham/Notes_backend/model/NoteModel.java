package com.subham.Notes_backend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class NoteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String note;

    @CreationTimestamp
    private LocalDateTime currentDateTime;

    @UpdateTimestamp
    private LocalDateTime updatedDateTime;

    private String tags;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    // Getters and Setters
    public UserModel getUserModel() {
        return user;
    }

    public void setUserModel(UserModel userModel) {
        this.user = userModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}