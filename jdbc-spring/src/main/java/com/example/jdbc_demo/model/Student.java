package com.example.jdbc_demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// cause model wont be a singleton
@Scope("prototype")
public class Student {
    private int rollNumber;
    private String name;
    private int score;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
