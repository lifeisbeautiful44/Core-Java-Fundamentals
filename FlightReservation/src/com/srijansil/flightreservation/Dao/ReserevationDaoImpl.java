package com.srijansil.flightreservation.Dao;

import java.util.HashMap;

import com.srijansil.flightreservation.model.Flight;
import com.srijansil.flightreservation.model.Reservation;

public class ReserevationDaoImpl implements ReservationDao {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;

	public ReserevationDaoImpl() {
		flights = new HashMap<>();
		reservations = new HashMap<>();

		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("Buddha Air");
		flight1.setDepartureCity("Kathmandu");
		flight1.setArrivalCity("Jhapa");
		flight1.setDateAndTimeOfDeparture("10/14/2022");

		flights.put(flight1.getId(), flight1);

		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirlines("International Aus");
		flight2.setDepartureCity("KTM");
		flight2.setArrivalCity("Adeliadle");
		flight2.setDateAndTimeOfDeparture("01/10/2023");

		flights.put(flight2.getId(), flight2);

	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId + 1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		return reservation;

	}

	@Override
	public Reservation checkIn(long reservationid, int noOfBags) {
		Reservation reservation = reservations.get(reservationid);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		
		return reservation;
	}

}
