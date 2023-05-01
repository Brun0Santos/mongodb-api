package com.app.api.service;

import com.app.api.entities.UserEntity;
import com.app.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<UserEntity> findAllUsers() {
        return repository.findAll();
    }
}
