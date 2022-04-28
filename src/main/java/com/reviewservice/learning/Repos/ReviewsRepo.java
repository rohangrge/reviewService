package com.reviewservice.learning.Repos;


import com.reviewservice.learning.Entities.Hotels;
import com.reviewservice.learning.Entities.Reviews;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepo extends MongoRepository<Reviews, String> {
    List<Reviews> findAllByHotelId(String hotelId);
}
