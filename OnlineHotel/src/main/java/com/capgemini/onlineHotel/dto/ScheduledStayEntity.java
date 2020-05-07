package com.capgemini.onlineHotel.dto;

import java.sql.Date;

public class ScheduledStayEntity {
	private int stayID;
	private int bookingID; 
	private int hotelID;
	private String roomType;
	private String guestName;
	private int phoneNo;
	private Date checkInDate;
	private Date checkOutDate;
	
	public ScheduledStayEntity() {
		
	}
	
	public ScheduledStayEntity(int bookingID, int hotelID, String roomType, String guestName, int phoneNo,
			Date checkInDate, Date checkOutDate) {
		this();
		this.bookingID = bookingID;
		this.hotelID = hotelID;
		this.roomType = roomType;
		this.guestName = guestName;
		this.phoneNo = phoneNo;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public int getStayID() {
		return stayID;
	}

	public int getBookingID() {
		return bookingID;
	}

	public int getHotelID() {
		return hotelID;
	}

	public String getRoomType() {
		return roomType;
	}

	public String getGuestName() {
		return guestName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
}
