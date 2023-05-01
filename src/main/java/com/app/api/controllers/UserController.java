package com.app.api.controllers;

import com.app.api.entities.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserEntity> returnAllUsers() {
        UserEntity marcos = new UserEntity("1", "Alex", "alex@gmail.com");
        return ResponseEntity.ok().body(marcos);
    }
}
