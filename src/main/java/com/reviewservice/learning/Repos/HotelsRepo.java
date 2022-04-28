package com.reviewservice.learning.Repos;

import com.reviewservice.learning.Entities.Hotels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsRepo extends MongoRepository<Hotels, String> {
}
