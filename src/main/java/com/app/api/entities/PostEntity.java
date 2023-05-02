package com.app.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "post")
public class PostEntity {
    @Id
    private String id;
    private LocalDateTime date;
    private String title;
    private String body;
    private UserEntity user;

    public PostEntity() {
    }

    public PostEntity(String id, LocalDateTime date, String title, String body, UserEntity user) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public UserEntity getUser() {
        return user;
    }
}
