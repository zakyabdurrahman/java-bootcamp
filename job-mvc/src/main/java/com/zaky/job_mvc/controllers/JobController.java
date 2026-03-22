package com.zaky.job_mvc.controllers;


//just add controller annotation and it will work and registered automagically
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {
    @GetMapping("/")
    public String home () {
        return "home";
    }


}
