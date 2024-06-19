package com.example.sololearn.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // returning json array of objects
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // take request body and map it to student object to insert into database
    @PostMapping
    public void registerNewStudent(@RequestBody  Student student) {
        studentService.addNewStudent(student);
    }


    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }


    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        studentService.updateStudent(studentId, name, email);
    }





}
