package com.miguelsd.project1spring.config;

import com.miguelsd.project1spring.entities.User;
import com.miguelsd.project1spring.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "mariabrown@gmail.com", "123123", "12345");
        User u2 = new User(null,"Alex Green", "alex@gmail.com", "293812738", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
