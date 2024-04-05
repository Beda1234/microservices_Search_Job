package com.job.search.service.impl;

import com.job.search.entity.Company;
import com.job.search.entity.Job;
import com.job.search.repository.CompanyRepository;
import com.job.search.repository.JobRepository;
import com.job.search.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    public JobRepository jobRepository;
    @Autowired
    public CompanyRepository companyRepository;

    @Override
    public Job saveJob(Job job) {
        Optional<Company> byId = companyRepository.findById(job.getId());
        if(byId.isEmpty()){
            throw new RuntimeException("No company id present !!");
        }
        return jobRepository.save(job);
    }

    @Override
    public Job getJobById(int id) {
        return  jobRepository.findById(id).orElseThrow(()-> new RuntimeException("Job not found"));
    }

    @Override
    public List<Job> getAllJob() {
        return jobRepository.findAll();
    }

    @Override
    public String deleteJobById(int id) {
        jobRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
