package com.example.sololearn.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController {

    // create reference to student service
    private final  StudentService studentService;

    // Constructor - add student service to constructor. Injecting student service into student controller constructor
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    //	 returning json array of objects
    public List<Student> getStudents() {
        return studentService.getStudents();
    }





}
