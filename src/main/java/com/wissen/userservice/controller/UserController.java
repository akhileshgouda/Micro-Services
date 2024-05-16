package com.wissen.userservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.userservice.entites.User;
import com.wissen.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userservice;
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        String string = UUID.randomUUID().toString();
        user.setUserId(string);
        User saveUser = userservice.saveUser(user);     
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
    }
    
    @GetMapping(value = "/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        System.out.println("hi");

        User user = userservice.getUser(userId);
        System.out.println("hi");
        return ResponseEntity.ok(user);
    }
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = userservice.getAllUser();
        return ResponseEntity.ok(allUser);
    }

}
