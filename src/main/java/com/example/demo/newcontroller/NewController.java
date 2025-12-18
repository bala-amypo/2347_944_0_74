package com.example.demo.newcontroller;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class NewController {

    private final NewfileService service;

    public NewController(NewfileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<NewfileEntity> createStudent(
            @Valid @RequestBody NewfileEntity student) {

        NewfileEntity saved = service.savedata(student);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
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
    public NewfileEntity updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody NewfileEntity student) {

        return service.update(id, student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
