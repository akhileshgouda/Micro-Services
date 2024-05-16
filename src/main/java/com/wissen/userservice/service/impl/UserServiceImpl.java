package com.wissen.userservice.service.impl;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.userservice.entites.User;
import com.wissen.userservice.repositories.UserRepository;
import com.wissen.userservice.service.UserService;
import com.wissen.userservice.userexceptions.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException()) ;
    }

    @Override
    public void deleteById(String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateById() {
        // TODO Auto-generated method stub
        
    }

}
