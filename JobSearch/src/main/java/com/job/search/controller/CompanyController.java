package com.job.search.controller;

import com.job.search.entity.Company;
import com.job.search.entity.Job;
import com.job.search.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> saveJob(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.saveCompany(company), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable int id) {
        return new ResponseEntity<>(companyService.getCompanyById(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Company>> getAllCompany() {
        return new ResponseEntity<>(companyService.getAllCompany(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanyById(@PathVariable int id) {
        return new ResponseEntity<>(companyService.deleteCompanyById(id), HttpStatus.OK);
    }
}
