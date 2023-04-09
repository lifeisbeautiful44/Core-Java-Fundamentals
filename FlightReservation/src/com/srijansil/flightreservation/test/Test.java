package com.srijansil.flightreservation.test;

import com.srijansil.flightreservation.Dao.ReserevationDaoImpl;
import com.srijansil.flightreservation.Dao.ReservationDao;
import com.srijansil.flightreservation.model.Passenger;
import com.srijansil.flightreservation.model.Reservation;

public class Test {

	public static void main(String[] args) {

		ReservationDao dao = new ReserevationDaoImpl();
		
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setFirstName("Srijansil");
		passenger.setLastName("Bohara");
		passenger.setEmail("bohara@srijnasil.com");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		
		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(savedReservation);
		
		Reservation checkInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkInReservation);
		
		
		
	}

}
