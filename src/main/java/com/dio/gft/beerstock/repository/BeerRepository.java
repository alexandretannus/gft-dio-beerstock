package com.dio.gft.beerstock.repository;

import java.util.Optional;

import com.dio.gft.beerstock.entity.Beer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    Optional<Beer> findByName(String name);
}
