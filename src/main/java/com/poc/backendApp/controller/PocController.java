package com.poc.backendApp.controller;

import com.poc.backendApp.model.Student;
import com.poc.backendApp.service.PocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("poc")
public class PocController {

    @Autowired
    PocService pocService;

    // get students.
    @GetMapping
    public ResponseEntity<List<Student>> getStudents()
    {
       return pocService.getAllStudents();
    }
    // get a student.
    @GetMapping("/{name}")
    public ResponseEntity<Student> getStudent(@PathVariable String name)
    {
        return pocService.getStudentById(name);
    }
    // add student.
    @PostMapping
    public ResponseEntity<Student> postStudent(@RequestBody Student student)
    {
        return pocService.addStudent(student);
    }
    // delete a student.
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable String id)
    {
        return pocService.removeStudent(id);
    }
    
    // update a student.
}
