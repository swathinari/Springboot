package com.userRegister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.userRegister.entity.UserEntity;
import com.userRegister.repository.UserRepository;

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserEntity user) {
        UserEntity savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

}
