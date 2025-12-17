package com.example.demo.service;
import java.util.List;

import java.util.Optional;
import com.example.demo.entity.StudentEntity;

public interface StudentService{
    StudentEntity postStudent(StudentEntity st);
    List<StudentEntity> getdata();
    StudentEntity updatedata(int id,StudentEntity std);
    String deletedata(int id);
}