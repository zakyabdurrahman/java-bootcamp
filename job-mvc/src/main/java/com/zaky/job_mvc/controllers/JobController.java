package com.zaky.job_mvc.controllers;


//just add controller annotation and it will work and registered automagically
import com.zaky.job_mvc.models.JobPost;
import com.zaky.job_mvc.services.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobPostService jobPostService;
    //for cases where different url has same view
    @GetMapping({"/home", "/"})
    public String home () {
        return "home";
    }

    @GetMapping("/addjob")
    public String jobForm() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    //first the request payload, second the response data
    public String handleForm(JobPost jobPost, Model model) {

        model.addAttribute("data", jobPost);
        jobPostService.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String showJobs(Model model) {

        List<JobPost> jobs = jobPostService.getJobs();

        model.addAttribute("data", jobs);
        return "viewalljobs";
    }


}
