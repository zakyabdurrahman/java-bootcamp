package com.zaky.job_mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

//this lombok annotations will make this class has constructors and getter setters auto generated

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class JobPost {
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private ArrayList<String> postTechStack;
}
