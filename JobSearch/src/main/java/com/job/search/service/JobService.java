package com.job.search.service;

import com.job.search.entity.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {
    Job saveJob(Job job);
    Job getJobById(int id);
    List<Job> getAllJob();
    Job deleteJobById(int id);
}
