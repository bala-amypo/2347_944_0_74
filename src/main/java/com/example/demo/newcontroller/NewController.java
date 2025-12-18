package com.example.demo.newcontroller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class NewfileController {

    private final NewfileService service;

    public NewfileController(NewfileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity <Student> createStudent(@Valid @RequestBodyStudent service) {
        return new ResponseEntity<String>(service.saveStudent(student),HttpStatus.CREATED);
    }

    @GetMapping
    public List<NewfileEntity> getall() {
        return service.getall();
    }

    @GetMapping("/{id}")
    public NewfileEntity getStudent(@PathVariable Long id) {
        return service.getidval(id);
    }

    @PutMapping("/{id}")
    public NewfileEntity updateStudent(@PathVariable Long id,
    @Valid @RequestBody Student student) {
        return service.update(id, student);
    }
}