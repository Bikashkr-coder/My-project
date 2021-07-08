package com.flightdetails.flight.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightdetails.flight.details.models.FlightModel;
import com.flightdetails.flight.details.services.FlightService;


@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;
    @GetMapping("/fetch")
    public ResponseEntity<List<FlightModel>> getFlight() {
        List<FlightModel> flights = flightService.getFlight();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }
    @PostMapping("/postflight")
    public ResponseEntity<FlightModel> saveFlight(@RequestBody FlightModel flight) {
        FlightModel s = flightService.saveFlight(flight);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }
    @PutMapping("/updateflight")
    public ResponseEntity<FlightModel> updateFlight(@RequestBody FlightModel flight) {
    	FlightModel s = flightService.updateFlight(flight);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }
    @DeleteMapping("/deletetrain")
    public ResponseEntity<String> deleteFlight(@RequestParam(name = "id") String id) {
        String message = flightService.getFlight(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
