package com.app.api.controllers;

import com.app.api.entities.UserEntity;
import com.app.api.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<UserEntity>> returnAllUsers() {
        return ResponseEntity.ok().body(services.findAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserEntity>> returnSpecifUsers(@PathVariable String id) {
        return ResponseEntity.ok().body(services.findById(id));
    }

    @PostMapping
    public ResponseEntity saveUser(@RequestBody UserEntity user) {
        services.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
