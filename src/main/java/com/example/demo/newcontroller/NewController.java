package com.example.demo.newcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;

@RestController
public class NewController {
    @Autowired
    NewfileService src;
    @PostMapping("/post")
    public NewfileEntity postdata(@RequestBody NewfileEntity st){
        return src.savedata(st);

    }
    @GetMapping("/get")
    public List<NewfileEntity> getdata(){
        return src.retdata();

    }
    @GetMapping("/getid/{id}")
    public  NewfileEntity getIdVal(@PathVariable Long id){
        return src.id(id);