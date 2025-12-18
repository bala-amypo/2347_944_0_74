package com.example.demo.service;

import java.util.*;
import org.springframework.stereotype.StudentService;
import com.example.demo.entity.StudentEntity;
@Service
public class StudentService {
Map<Integer,StudentEntity> mp=new HashMap<>();
    public StudentEntity savedata(StudentEntity st){
        mp.put(st.getId(),st);
        return st;
    }
    public List<StudentEntity> retdata() {
         return new ArrayList<>(mp.values());
    }
    public StudentEntity id(int id) {
        
       // throw new UnsupportedOperationException("Unimplemented method 'id'");
       return mp.get(id);
    }
   
    public StudentEntity updateStudent(int id, StudentEntity st) {
     mp.replace(id,st);
     return mp.get(id);
    }
    public StudentEntity deleteStudent(int id) {
       return mp.remove(id);
    }
}