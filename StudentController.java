package com.example.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
}