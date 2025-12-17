package com.example.demo.newentity;

import jakarta.persistence.Id;

public class NewfileEntity {
    @Id
    private Long id;
    private String name;
    private String email;
}