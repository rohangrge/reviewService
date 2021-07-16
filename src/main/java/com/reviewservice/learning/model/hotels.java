package com.reviewservice.learning.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document("hotels")
public class hotels {
    @Id
    private String id;
    @Field(name = "HName")
    private String name;
    @Field(name="cusine")
    private cuisineenum cuisine;
    @Field(name="address")
    private  String address;
    @Field(name="phoneNo")
    private long pno;


    public hotels(String name,cuisineenum cuisine,String address,long pno){
        this.name=name;
        this.cuisine=cuisine;
        this.address=address;
        this.pno=pno;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPno() {
        return pno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(cuisineenum cuisine) {
        this.cuisine = cuisine;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

