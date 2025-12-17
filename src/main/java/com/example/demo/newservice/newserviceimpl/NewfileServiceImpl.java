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
         return rep.findby(id);
     }

     @Override
     public List<NewfileEntity> getall(){
         return rep.getall();
     }

     @Override
     public NewfileEntity update(Long id, NewfileEntity newfile){
          return rep.replace(id,newfile);
     }

     @Override
     public void delete(Long id){
           return rep.remove(id)
     }
  }