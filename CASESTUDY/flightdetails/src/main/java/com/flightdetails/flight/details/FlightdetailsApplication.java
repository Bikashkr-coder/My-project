package com.flightdetails.flight.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightdetailsApplication.class, args);
	}

}
