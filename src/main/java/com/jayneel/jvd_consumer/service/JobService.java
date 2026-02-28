package com.jayneel.jvd_consumer.service;

import com.jayneel.jvd_consumer.model.JobPost;
import com.jayneel.jvd_consumer.repo.JobRepository;

import java.util.List;

public class JobService {

    public JobRepository jobRepository;


    public void addJob(JobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepository.getAllJobs();
    }
}
