package com.example.jdbc_demo.service;

import com.example.jdbc_demo.model.Student;
import com.example.jdbc_demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//service layer
//processing stuffs
@Component
public class StudentService {
    @Autowired
    public StudentService(StudentRepo repo) {

    }

    public void addStudent(Student s) {

    }
}
