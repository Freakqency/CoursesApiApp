package com.example.CoursesApiApp.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    @Id
    String id;
    String name;
    String description;
    public Topic() {}
    public Topic(String topicId, String s, String string) {}
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
