package com.app.api.dto;

import com.app.api.entities.UserEntity;

public class AuthorDto {
    private String id;
    private String name;

    public AuthorDto() {
    }

    public AuthorDto(UserEntity user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
