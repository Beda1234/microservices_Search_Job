package com.job.search.service.impl;

import com.job.search.entity.Company;
import com.job.search.repository.CompanyRepository;
import com.job.search.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company getCompanyById(int id) {
        return companyRepository.getById(id);
    }

    @Override
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    @Override
    public String deleteCompanyById(int id) {
        companyRepository.deleteById(id);
        return "Delete company Details";
    }
}
