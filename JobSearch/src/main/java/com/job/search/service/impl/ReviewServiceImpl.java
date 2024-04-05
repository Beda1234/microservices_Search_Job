package com.job.search.service.impl;

import com.job.search.entity.Company;
import com.job.search.entity.Review;
import com.job.search.repository.CompanyRepository;
import com.job.search.repository.ReviewRepository;
import com.job.search.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Review saveReviewOfACompany(Review review, int companyId) {
        Company byId = companyRepository.getById(companyId);
        if(byId == null) {
            throw new IllegalStateException("Could not find company");
        }
        return reviewRepository.save(review);
    }

    @Override
    public Review getReviewById(int reviewId, int companyId) {
        Company byId = companyRepository.getById(companyId);
        if(byId == null) {
            throw new IllegalStateException("Could not find company");
        }
        return reviewRepository.findById(reviewId).orElseThrow(()-> new IllegalStateException("Could not find review !!"));
    }

    @Override
    public List<Review> getAllReviewOfACompany(int companyId) {
        Company byId = companyRepository.getById(companyId);
        if(byId == null) {
            throw new IllegalStateException("Could not find company");
        }
        List<Review> byCompany = reviewRepository.findByCompanyId(companyId);
        return byCompany;
    }

    @Override
    public String deleteReviewOfACompanyById(int reviewId, int companyId) {
        Company byId = companyRepository.getById(companyId);
        if(byId == null) {
            throw new IllegalStateException("Could not find company");
        }
        reviewRepository.deleteById(reviewId);
        return "Deleted successfully";
    }
}
