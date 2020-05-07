package com.capgemini.onlineHotel.dto;

public class RoomEntity {

	private int hotelId;
	private String roomType;
	private int noOfRooms;
	private String amenities;
	private int noOfGuests;
	private int pricePerRoom;

	public RoomEntity() {

	}

	public RoomEntity(int hotelId, String roomType, int noOfRooms, String amenities, int noOfGuests, int pricePerRoom) {
		super();
		this.hotelId = hotelId;
		this.roomType = roomType;
		this.noOfRooms = noOfRooms;
		this.amenities = amenities;
		this.noOfGuests = noOfGuests;
		this.pricePerRoom = pricePerRoom;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public int getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

	public int getPricePerRoom() {
		return pricePerRoom;
	}

	public void setPricePerRoom(int pricePerRoom) {
		this.pricePerRoom = pricePerRoom;
	}

	@Override
	public String toString() {
		return "RoomEntity [hotelId=" + hotelId + ", roomType=" + roomType + ", noOfRooms=" + noOfRooms + ", amenities="
				+ amenities + ", noOfGuests=" + noOfGuests + ", pricePerRoom=" + pricePerRoom + "]";
	}

}
