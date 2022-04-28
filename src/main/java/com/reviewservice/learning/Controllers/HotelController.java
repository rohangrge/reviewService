package com.reviewservice.learning.Controllers;

import com.reviewservice.learning.ApiResponse;
import com.reviewservice.learning.Entities.Hotels;
import com.reviewservice.learning.Services.HotelService;
import com.reviewservice.learning.Services.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hotels")
@Slf4j
public class HotelController {
    private final HotelService hotelService;
    private final ReviewService reviewService;

    public HotelController(HotelService hotelService, ReviewService reviewService) {
        this.hotelService = hotelService;
        this.reviewService = reviewService;
    }

    @GetMapping("list")
    public ResponseEntity<ApiResponse> getAllHotels() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(hotelService.getAllHotels());
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("new")
    public ResponseEntity<ApiResponse> addNewHotel(@RequestBody Hotels hotels) {
        ApiResponse apiResponse = new ApiResponse();
        hotelService.addHotelToDb(hotels);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
