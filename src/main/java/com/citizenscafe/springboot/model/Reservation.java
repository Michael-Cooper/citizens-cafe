package com.citizenscafe.springboot.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Entity;

@Entity
@Table(name = "reservations")
public class Reservation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "party_size")
	private int partySize;
	
	@Column(name = "time")
	private Timestamp time;
	
	
	
	// constructors
	public Reservation(){}
	
	public Reservation(String name, String phoneNumber, int partySize, Timestamp time) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.partySize = partySize;
		this.time = time;
	}
	
	
	// getters/setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPartySize() {
		return partySize;
	}
	public void setPartySize(int partySize) {
		this.partySize = partySize;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	
	

}
