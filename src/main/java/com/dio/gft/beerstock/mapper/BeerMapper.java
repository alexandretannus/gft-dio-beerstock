package com.dio.gft.beerstock.mapper;

import com.dio.gft.beerstock.dto.BeerDTO;
import com.dio.gft.beerstock.entity.Beer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
