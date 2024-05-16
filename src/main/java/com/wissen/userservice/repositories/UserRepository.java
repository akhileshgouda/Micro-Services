package com.wissen.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissen.userservice.entites.User;

public interface UserRepository extends JpaRepository<User, String> {

}
