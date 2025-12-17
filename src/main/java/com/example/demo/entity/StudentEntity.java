package com.example.demo.entity;

import java.time.LocalDate;


public class StudentEntity {
    private String name;
    private int id;
    private LocalDate dob;
    private String email;
    private float cgpa;

    public StudentEntity(String name, int id, LocalDate dob, String email, float cgpa) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.email = email;
        this.cgpa = cgpa;
    }

    public StudentEntity(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
}