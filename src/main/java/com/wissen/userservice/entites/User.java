package com.wissen.userservice.entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name = "MicroUsers")
@Table(name = "micro_users")
@Data
public class User {

    @Id
    @Column(name = "Id")
    private String userId;
    
    @Column(name = "Name",length = 20)
    private String name;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "About")
    private String about;
    
    @jakarta.persistence.Transient
    private List<Rating> ratings = new ArrayList<>();
}
