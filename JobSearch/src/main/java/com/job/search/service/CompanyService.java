package com.job.search.service;

import com.job.search.entity.Company;

import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);
    Company getCompanyById(int id);
    List<Company> getAllCompany();
    String deleteCompanyById(int id);
}
