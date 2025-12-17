package com.example.demo.newservice.newserviceimpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;
@Service
  public  class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo rep; 

   public NewfileServiceImpl(NewfileRepo rep){
       this.rep=rep;
    }
     @Override
     public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);
     }

     @Override
     public NewfileEntity getidval(Long id){
         return rep.get(id);
     }

     @Override
     public List<NewfileEntity> getall(){
         return rep.
     }

     @Override
     public NewfileEntity update(Long id, NewfileEntity newfile){

     }

     @Override
     public void delete(Long id){

     }
  }