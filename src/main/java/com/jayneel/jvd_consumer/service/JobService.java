package com.jayneel.jvd_consumer.service;

import com.jayneel.jvd_consumer.model.JobPost;
import com.jayneel.jvd_consumer.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepository jobRepository;


    public void addJob(JobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepository.getAllJobs();
    }

    public JobPost getJob(int id){
        return jobRepository.getJob(id);
    }

    public JobPost editJob(JobPost jobPost){
        return jobRepository.editJob(jobPost);
    }

    public JobPost deleteJob(int id){
        return jobRepository.deleteJob(id);
    }
}
