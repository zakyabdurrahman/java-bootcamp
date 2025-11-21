package com.example.jdbc_demo.repo;

import com.example.jdbc_demo.model.Student;
import com.example.jdbc_demo.rowmapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<Student> findAll() {
        String sql = "SELECT * FROM STUDENTS";
        StudentRowMapper rowMapper = new StudentRowMapper();
        List<Student> students = template.query(sql, rowMapper);
        return students;
    }
}
