package com.example.jdbc_demo.service;

import com.example.jdbc_demo.model.Student;
import com.example.jdbc_demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//service layer
//processing stuffs
@Service
public class StudentService {
    private StudentRepo repo;
    @Autowired
    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }
}
