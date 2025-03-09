package com.goetiaCode.studentSystem.service;

//Controller ve Repository arasındaki işlemler - get-post-put-delete- servis ile sağlanacak

import com.goetiaCode.studentSystem.model.Student;

import java.util.List;


public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
