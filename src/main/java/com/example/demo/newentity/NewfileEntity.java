package com.example.demo.newentity;

import jakarta.persistence.Generated;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
     @NotBlank(message = "no blank allowed")
     @Email(message="invalid format")
    private String email;
}