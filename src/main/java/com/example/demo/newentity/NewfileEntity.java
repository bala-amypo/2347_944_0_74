package com.example.demo.newentity;

  import jakarta.persistence.GenerationValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Id;
  import jakarta.validation.constranints.*;
  
 
 @Entity 
 @Table(name="Student")
 public class NewfileEntity {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @column(name=unique) //@column(unique=true)
     @NotBlank(message = "no blank allowed")
     @Email(message = "invalid format")
    private String email;
    public NewfileEntity(Long id, @NotBlank(message = "should not contain spaces") String name,   @NotBlank(message = "no blank allowed")  @Email(message = "invalid format") String email) {
      this.id = id;
      this.name = name;
      this.email = email;
    }
    public NewfileEntity(){

    }
    public long getId() {
       return id;
    }
    public void setId(long id) {
       this.id = id;
    }
    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public String getEmail() {
       return email;
    }
    public void setEmail(String email) {
       this.email = email;
    }
     
 }