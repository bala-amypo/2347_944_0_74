package com.example.demo.newservice.newserviceimpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;
@Service
  public  class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo rep; 
     @Override
     public NewfileEntity savedata(NewfileEntity newfile){

     }

     @Override
     public NewfileEntity getidval(Long id){

     }

     @Override
     public List<NewfileEntity> getall(){

     }

     @Override
     public NewfileEntity update(Long id, NewfileEntity newfile){

     }

     @Override
     public void delete(Long id){

     }
  }