package com.capgemini.onlineHotel.dto;

import java.sql.Date;

public class HotelSearch {

	private String hotelName;
	private String location;
	private Date checkInDate;
	private Date checkOutDate;
	
	
	public HotelSearch() {
		
	}
	public HotelSearch(String hotelName, String location, Date checkInDate, Date checkOutDate) {
		super();
		this.hotelName = hotelName;
		this.location = location;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	@Override
	public String toString() {
		return "HotelSearch [hotelName=" + hotelName + ", location=" + location + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + "]";
	}
	
	
}
