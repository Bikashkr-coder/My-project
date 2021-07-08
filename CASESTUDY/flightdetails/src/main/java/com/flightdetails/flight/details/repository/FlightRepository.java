package com.flightdetails.flight.details.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flightdetails.flight.details.models.FlightModel;


public interface FlightRepository extends MongoRepository<FlightModel,String>{

}
