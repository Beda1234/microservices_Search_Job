package com.job.search.controller;

import com.job.search.entity.Job;
import com.job.search.service.impl.JobServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    public JobServiceImpl jobService;
    @PostMapping
    public ResponseEntity<Job> saveJob(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.saveJob(job), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable int id) {
        return new ResponseEntity<>(jobService.getJobById(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Job>> getAllJob() {
        return new ResponseEntity<>(jobService.getAllJob(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable int id) {
        return new ResponseEntity<>(jobService.deleteJobById(id), HttpStatus.OK);
    }
}
