package com.example.demo.newservice;

public interface NewfileService {
    NewfileEntity savedata(NewfileEntity newfile);
    NewfileEntity getidval(Long id);
    List<NewfileEntity> getall();
    NewfileEntity update(Long id,NewfileEntity newfile);
    void delete(Long id);
}