package com.microservices.user.apiuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.user.apiuser.model.User;
import com.microservices.user.apiuser.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok().body(userRepo.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userRepo.findById(id));
    }
    
    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        userRepo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    



}
