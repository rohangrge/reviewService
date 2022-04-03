package com.reviewservice.learning.repository;


import com.reviewservice.learning.model.Hotels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends MongoRepository<Hotels,String> {

    Optional<Hotels> findByCuisine(String cuisine);





}
