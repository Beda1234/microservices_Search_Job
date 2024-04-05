package com.job.search.service;

import com.job.search.entity.Company;
import com.job.search.entity.Review;

import java.util.List;

public interface ReviewService {
    Review saveReviewOfACompany(Review review,int companyId);
    Review getReviewById(int reviewId,int companyId);
    List<Review> getAllReviewOfACompany(int companyId);
    String deleteReviewOfACompanyById(int reviewId,int companyId);
}
