package com.flightdetails.flight.details.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightdetails.flight.details.models.FlightModel;
import com.flightdetails.flight.details.repository.FlightRepository;



@Service
public class FlightService {
	 @Autowired
	    private FlightRepository flightRepository;
	    public List<FlightModel> getFlight() {
	        return flightRepository.findAll();
	    }
	     
	    public FlightModel saveFlight(FlightModel flights) {
	        return flightRepository.save(flights);
	    }
	     
	    public FlightModel updateFlight(FlightModel flights) {
	        return flightRepository.save(flights);
	    }
	    public String getFlight(String id) {
	        flightRepository.deleteById(id);
	        return "Flight with id: " + id + " deleted successfully";
	    }

}

