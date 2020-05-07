package com.capgemini.onlineHotel.forms;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

public class SearchHotelsForm extends ActionForm {

	
	private static final long serialVersionUID = 8040788229846304723L;
	private String hotelName;
	private String location;
	private String checkInDate;
	private String checkOutDate;
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
	public String getCheckInDate(){
		return this.checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate(){
		return this.checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
	
}
