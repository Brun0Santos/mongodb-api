package com.app.api.service;

import com.app.api.entities.UserEntity;
import com.app.api.exceptions.NotFoundException;
import com.app.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<UserEntity> findAllUsers() {
        return repository.findAll();
    }

    public Optional<UserEntity> findById(String id) {
        Optional<UserEntity> byId = repository.findById(id);
        byId.orElseThrow(() -> new NotFoundException("user not found"));
        return byId;
    }

    public void saveUser(UserEntity user) {
        repository.save(user);
    }
}
