package com.reviewservice.learning.Services;

import com.reviewservice.learning.Entities.Hotels;
import com.reviewservice.learning.Repos.HotelsRepo;
import com.reviewservice.learning.Repos.ReviewsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class HotelService {
    private final ReviewsRepo reviewsRepo;
    private final HotelsRepo hotelsRepo;

    HotelService(ReviewsRepo reviewsRepo, HotelsRepo hotelsRepo) {
        this.hotelsRepo = hotelsRepo;
        this.reviewsRepo = reviewsRepo;
    }

    public void addHotelToDb(Hotels hotels) {
        if (hotels != null) {
            hotelsRepo.save(hotels);
        }
    }

    public void updateHotel(String hotelId, Hotels hotels) {
        Optional<Hotels> hotelsOptional = hotelsRepo.findById(hotelId);
        if (hotelsOptional.isPresent()) {
            Hotels hotels1 = hotelsOptional.get();
            hotelsRepo.save(hotels1);
        }
    }

    public Hotels getHotelDetails(String hotelId) {
        Optional<Hotels> hotelsOptional = hotelsRepo.findById(hotelId);
        if (hotelsOptional.isPresent()) {
            Hotels hotels = hotelsOptional.get();
            return hotels;
        }
        return null;
    }

    public List<Hotels> getAllHotels() {
        List<Hotels> hotelsList = hotelsRepo.findAll();
        return hotelsList;
    }


}
