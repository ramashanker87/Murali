package com.murali.app.controller;

import com.murali.app.model.Student;
import com.murali.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private  StudentService studentService ;

//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody final Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/read")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
