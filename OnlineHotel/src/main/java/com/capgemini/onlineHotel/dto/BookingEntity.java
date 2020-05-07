package com.capgemini.onlineHotel.dto;

import java.sql.Date;

public class BookingEntity {
	private int bookingID;
	private Date bookingDate;
	private String userName;
	private String bookingStatus;
	
	public BookingEntity() {
		this.bookingDate = new Date(System.currentTimeMillis());
	}

	public BookingEntity(String userName, String bookingStatus) {
		this();
		this.userName = userName;
		this.bookingStatus = bookingStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getBookingID() {
		return bookingID;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

}
