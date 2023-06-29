package com.citizenscafe.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citizenscafe.springboot.model.Reservation;
import com.citizenscafe.springboot.repository.ReservationRepo;

@CrossOrigin("*") 
@RestController
@RequestMapping("/api/v1/")
public class ReservationController {

	@Autowired
	private ReservationRepo reservationRepo;
	
	// get all reservations
	@GetMapping("/reservations")
	public List<Reservation> getReservations()
	{
		return reservationRepo.findAll();
	}
	
	// create reservation
	@PostMapping("/reservations")
	public Reservation createReservation(@RequestBody Reservation reservation)
	{
		return reservationRepo.save(reservation);
	}
}
