package com.app.api.controllers;

import com.app.api.entities.UserEntity;
import com.app.api.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<UserEntity>> returnAllUsers() {
        return ResponseEntity.ok().body(services.findAllUsers());
    }
}
