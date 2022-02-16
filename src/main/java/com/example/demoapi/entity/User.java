package com.example.demoapi.entity;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name ="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String mail;

}
