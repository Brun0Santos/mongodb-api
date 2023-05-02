package com.app.api.config;

import com.app.api.entities.PostEntity;
import com.app.api.entities.UserEntity;
import com.app.api.repository.PostRepository;
import com.app.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:32mm");
        userRepository.deleteAll();
        UserEntity personOne = new UserEntity(null, "Leticia", "leticia@gmail.com");
        UserEntity personTwo = new UserEntity(null, "Marcos", "marcos@gmail.com");
        UserEntity personThree = new UserEntity(null, "Kleber", "kleber@gmail.com");
        UserEntity personFour = new UserEntity(null, "Lilian", "lilian@gmail.com");
        userRepository.saveAll(Arrays.asList(personOne, personTwo, personThree));

        PostEntity postOne = new PostEntity(null, LocalDateTime.now(), "Viagem", "A viagem dos q n foram", personOne);

        PostEntity postTwo = new PostEntity(null, LocalDateTime.now(), "Terror", "It.", personTwo);

        postRepository.saveAll(Arrays.asList(postOne, postTwo));


    }
}
