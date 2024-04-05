package com.job.search.service;

import com.job.search.entity.Job;

import java.util.List;

public interface JobService {
    Job saveJob(Job job);
    Job getJobById(int id);
    List<Job> getAllJob();
    String deleteJobById(int id);
}
