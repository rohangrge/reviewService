package com.reviewservice.learning.Services;

import com.reviewservice.learning.Entities.Reviews;
import com.reviewservice.learning.Repos.HotelsRepo;
import com.reviewservice.learning.Repos.ReviewsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class ReviewService {
    private final HotelsRepo hotelsRepo;
    private final ReviewsRepo reviewsRepo;

    ReviewService(HotelsRepo hotelsRepo, ReviewsRepo reviewsRepo) {
        this.hotelsRepo = hotelsRepo;
        this.reviewsRepo = reviewsRepo;
    }

    public void addReview(String hotelId, Reviews reviews) {
        if (hotelId != null && reviews != null) {
            reviewsRepo.save(reviews);
        }
    }

    public void updatedReview(String reviewId, Reviews reviewsUpdated) {
        Optional<Reviews> reviewsOptional = reviewsRepo.findById(reviewId);
        if (reviewsOptional.isPresent()) {
            Reviews reviews = reviewsOptional.get();
            reviews = reviewsUpdated;
            reviewsRepo.save(reviews);
        }
    }

    public List<Reviews> getAllReviews(String hotelId) {
        List<Reviews> reviewsList = new ArrayList<>();
        reviewsList = reviewsRepo.findAllByHotelId(hotelId);
        return reviewsList;

    }

}
