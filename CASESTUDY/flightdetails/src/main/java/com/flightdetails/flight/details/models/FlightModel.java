package com.flightdetails.flight.details.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FlightDetails")
public class FlightModel {
	@Id
	private String flightname;
	private String from;
	private String to;
	private String departuretime;
	private String arrivaltime;
	private String seatavailability;
	private String AC;
	private String nonAc;
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getSeatavailability() {
		return seatavailability;
	}
	public void setSeatavailability(String seatavailability) {
		this.seatavailability = seatavailability;
	}
	public String getAC() {
		return AC;
	}
	public void setAC(String aC) {
		AC = aC;
	}
	public String getNonAc() {
		return nonAc;
	}
	public void setNonAc(String nonAc) {
		this.nonAc = nonAc;
	}
	@Override
	public String toString() {
		return "FlightModel [flightname=" + flightname + ", from=" + from + ", to=" + to + ", departuretime="
				+ departuretime + ", arrivaltime=" + arrivaltime + ", seatavailability=" + seatavailability + ", AC="
				+ AC + ", nonAc=" + nonAc + "]";
	}
	
	
	

}
