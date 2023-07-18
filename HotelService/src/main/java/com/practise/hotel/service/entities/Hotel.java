package com.practise.hotel.service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @Column(name = "id")
    private String hotelId;

    @Column (name = "name")
    private String hotelName;

    @Column (name = "location")
    private String hotelLocation;

    @Column (name = "about")
    private String hotelAbout;
}
