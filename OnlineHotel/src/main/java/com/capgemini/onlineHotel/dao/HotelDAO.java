package com.capgemini.onlineHotel.dao;

import com.capgemini.onlineHotel.dto.HotelEntity;
import com.capgemini.onlineHotel.dto.HotelSearch;

public interface HotelDAO {

	public HotelEntity searchHotel(HotelSearch search);
}
