package com.example.jdbc_demo.rowmapper;

import com.example.jdbc_demo.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s = new Student();
        s.setName(rs.getString("name"));
        s.setScore(rs.getInt("score"));
        s.setRollNumber(rs.getInt("roll_number"));


        return s;
    }
}
