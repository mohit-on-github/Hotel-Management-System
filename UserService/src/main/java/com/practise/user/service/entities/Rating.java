package com.practise.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rating {
    private String ratingId;

    private String userId;

    private String hotelId;

    private int rating;

    private String review;
}
