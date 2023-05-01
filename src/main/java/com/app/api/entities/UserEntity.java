package com.app.api.entities;

public class UserEntity {
    private String id;
    private String name;
    private String email;

    public UserEntity() {
    }

    public UserEntity(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
