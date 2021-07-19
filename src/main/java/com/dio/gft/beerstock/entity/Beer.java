package com.dio.gft.beerstock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dio.gft.beerstock.enums.BeerType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "beer")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "beer_name")
    private String name;

    private String brand;

    @Column(name = "max_stock")
    private int max;

    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "beer_type")
    private BeerType type;
}
