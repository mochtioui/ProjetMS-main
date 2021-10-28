package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	

	private static final long serialVersionUID = -7049957706738879274L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String startDate;
	private String endDate;
	private int payOrNot;
	private float price;
	private String address;
	private int hourStart;
	private int club;
	public int getClub() {
		return club;
	}
	public void setClub(int club) {
		this.club = club;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getPayOrNot() {
		return payOrNot;
	}
	public void setPayOrNot(int payOrNot) {
		this.payOrNot = payOrNot;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHourStart() {
		return hourStart;
	}
	public void setHourStart(int hourStart) {
		this.hourStart = hourStart;
	}
	public int getHourEnd() {
		return hourEnd;
	}
	public void setHourEnd(int hourEnd) {
		this.hourEnd = hourEnd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int hourEnd;
	


}
