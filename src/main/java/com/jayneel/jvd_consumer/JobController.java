package com.jayneel.jvd_consumer;

import com.jayneel.jvd_consumer.model.JobPost;
import com.jayneel.jvd_consumer.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

   @GetMapping("/job-posts")
    public List<JobPost> getAllJobs(){
       return jobService.getAllJobs();
   }

    @GetMapping("/job-post/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return jobService.getJob(postId);
    }

   @PostMapping("/job-post")
    public void postJob(@RequestBody JobPost jobPost){
       jobService.addJob(jobPost);
   }

   @PutMapping("/job-post")
    public JobPost editJob(@RequestBody JobPost jobPost){
        return jobService.editJob(jobPost);
   }

   @DeleteMapping("/job-post/{id}")
    public JobPost deleteJob(@PathVariable int id){
       return jobService.deleteJob(id);
   }
}
