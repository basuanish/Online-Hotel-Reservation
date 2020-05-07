package com.capgemini.onlineHotel.service;

import com.capgemini.onlineHotel.DAO.HotelDAO;
import com.capgemini.onlineHotel.daoImpl.HotelDAOImpl;
import com.capgemini.onlineHotel.dto.HotelEntity;
import com.capgemini.onlineHotel.dto.HotelSearch;

public class HotelService {

	public HotelEntity searchHotel(HotelSearch search) {
		HotelEntity hotel = new HotelEntity();
		HotelDAO dao = new HotelDAOImpl();
		
		hotel = dao.searchHotel(search);
		System.out.println("Hotel found: "+hotel);
		return hotel;
	}
}
