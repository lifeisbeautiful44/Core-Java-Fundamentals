package com.srijansil.flightreservation.Dao;

import com.srijansil.flightreservation.model.Reservation;

public interface ReservationDao {
	
	Reservation bookFlight(Reservation reservation);
	Reservation checkIn(long reservationid, int noOfBags);

}
