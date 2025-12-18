// package com.example.demo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.entity.StudentEntity;
// import com.example.demo.service.StudentService;
// @RestController
// public class StudentController{
// @Autowired
// StudentService src;
// @PostMapping("/post")

//     public StudentEntity postdata(@RequestBody Studententity st){
//         return src.savedata(st);
//     }
//     @GetMapping("/get")
//     public List<StudentEntity>getdata(){
//         return src.retdata();
//     }
//     @GetMapping("/get/{id}")
//     public StudentEntity getIdval(@PathVariable int id){
//         return src.id(id);
//     }
//     @PutMapping("/updatedata/{id}")
//     public StudentEntity update(@PathVariable int id,@RequestBody StudentEntity st){
//         return src.updateStudent(id,st);
//     }
//     @DeleteMapping("/delete/{id}")
//     public StudentEntity deleteStudent(@PathVariable int id){
//         return src.deleteStudent(id);
//     }
// }