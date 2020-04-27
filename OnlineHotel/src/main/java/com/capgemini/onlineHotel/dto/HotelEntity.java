package com.capgemini.onlineHotel.dto;

public class HotelEntity {

	private int hotelId;
	private String hotelName;
	private String location;
	
	
	public HotelEntity() {
		
	}
	public HotelEntity(int hotelId, String hotelName, String location) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.location = location;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
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
	@Override
	public String toString() {
		return "HotelEntity [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + "]";
	}
	
	
	
}
