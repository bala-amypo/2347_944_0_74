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
        return rep.findbyId(id);

     }

     @Override
     public List<NewfileEntity> getall(){
        return rep.findall();

     }

     @Override
     public NewfileEntity update(Long id, NewfileEntity newfile){
       NewfileEntity existing = getidval(id);
       existing.setName(newfile.getName());
       existing.setEmail(newfile.getEmail());
       return rep.save(existing);
     }

     @Override
     public void delete(Long id){
        rep.deletebyId(Long id);
     }
  }