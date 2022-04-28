package com.reviewservice.learning.Entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Reviews {
    @Id
    private String id;
    private String reviewTitle;
    private String reviewSubTitle;
    private String reviewContent;
    private int reviewStars;
    private String hotelId;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

}
