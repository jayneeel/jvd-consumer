package com.jayneel.jvd_consumer;

import com.jayneel.jvd_consumer.model.JobPost;
import com.jayneel.jvd_consumer.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

   @GetMapping("/job-posts")
    public List<JobPost> getAllJobs(){
       return jobService.getAllJobs();
   }

   @PostMapping("/job-post")
    public void postJob(JobPost jobPost){
       jobService.addJob(jobPost);
   }
}
