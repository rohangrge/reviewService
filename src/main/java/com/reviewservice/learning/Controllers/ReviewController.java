package com.reviewservice.learning.Controllers;

import com.reviewservice.learning.ApiResponse;
import com.reviewservice.learning.Repos.HotelsRepo;
import com.reviewservice.learning.Repos.ReviewsRepo;
import com.reviewservice.learning.Services.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewsRepo reviewsRepo;
    private final HotelsRepo hotelsRepo;
    private final ReviewService reviewService;

    ReviewController(ReviewsRepo reviewsRepo, HotelsRepo hotelsRepo, ReviewService reviewService) {
        this.hotelsRepo = hotelsRepo;
        this.reviewsRepo = reviewsRepo;
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllReviews() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(reviewsRepo.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
