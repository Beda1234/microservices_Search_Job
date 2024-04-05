package com.job.search.controller;

import com.job.search.entity.Review;
import com.job.search.service.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company/{companyId}")
public class ReviewController {
    @Autowired
    private ReviewServiceImpl reviewService;

    @PostMapping("/reviews")
    public ResponseEntity<Review> saveReviewOfACompany(@RequestBody Review review,@PathVariable int companyId) {
        return new ResponseEntity<>(reviewService.saveReviewOfACompany(review,companyId), HttpStatus.OK);
    }
    @GetMapping("/reviews/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable int companyId,@PathVariable int id) {
        return new ResponseEntity<>(reviewService.getReviewById(id,companyId), HttpStatus.OK);
    }
    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviewOfACompany(@PathVariable int companyId) {
        return new ResponseEntity<>(reviewService.getAllReviewOfACompany(companyId), HttpStatus.OK);
    }
    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<String> deleteReviewOfACompanyById(@PathVariable int companyId,@PathVariable int id) {
        return new ResponseEntity<>(reviewService.deleteReviewOfACompanyById(id,companyId), HttpStatus.OK);
    }
}
