package com.example.demo.newservice;

public interface NewfileService {
    NewfileEntity savedata(NewfileEntity newfile);
    NewfileEntity getidval(Long id);
}