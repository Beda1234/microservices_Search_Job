package com.job.search.service.impl;

import com.job.search.entity.Job;
import com.job.search.repository.JobRepository;
import com.job.search.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    public JobRepository jobRepository;
    @Override
    public Job saveJob(Job job) {
        return null;
    }

    @Override
    public Job getJobById(int id) {
        return null;
    }

    @Override
    public List<Job> getAllJob() {
        return null;
    }

    @Override
    public Job deleteJobById(int id) {
        return null;
    }
}
