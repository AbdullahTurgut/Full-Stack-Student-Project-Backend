package com.goetiaCode.studentSystem.controller;

import com.goetiaCode.studentSystem.model.Student;
import com.goetiaCode.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin //frontend den ekleme yaparken CORS error aldık.
public class StudentController {

    @Autowired
    private StudentService studentService;



    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added.";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
