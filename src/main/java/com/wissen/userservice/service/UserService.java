package com.wissen.userservice.service;

import java.util.List;

import com.wissen.userservice.entites.User;

public interface UserService {

    User saveUser(User user);
    
    List<User> getAllUser();
    
    User getUser(String userId);
    
    void deleteById(String userId);
    
    void updateById();
    
}
