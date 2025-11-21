package com.example.jdbc_demo.repo;

import com.example.jdbc_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//basically a DAO for a table
@Repository
public class StudentRepo {

    private JdbcTemplate template;
    @Autowired
    public StudentRepo(JdbcTemplate t) {
        this.template = t;
    }

    public void save(Student s) {
        String sql = "INSERT INTO STUDENTS (roll_number, name, score) values (?, ?, ?)";

        template.update(sql, s.getRollNumber(), s.getName(), s.getScore());
    }
}
