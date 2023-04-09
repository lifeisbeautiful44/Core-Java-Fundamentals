package com.srijansil.flightreservation.model;

public class Flight extends AbstractModel {

	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private String dateAndTimeOfDeparture;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDateAndTimeOfDeparture() {
		return dateAndTimeOfDeparture;
	}

	public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
		this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flight [flightNumber=");
		builder.append(flightNumber);
		builder.append(", operatingAirlines=");
		builder.append(operatingAirlines);
		builder.append(", departureCity=");
		builder.append(departureCity);
		builder.append(", arrivalCity=");
		builder.append(arrivalCity);
		builder.append(", dateAndTimeOfDeparture=");
		builder.append(dateAndTimeOfDeparture);
		builder.append("]");
		return builder.toString();
	}
	

}