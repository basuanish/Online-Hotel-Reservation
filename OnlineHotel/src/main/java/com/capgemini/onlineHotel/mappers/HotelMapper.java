package com.capgemini.onlineHotel.mappers;

import com.capgemini.onlineHotel.dto.HotelEntity;
import com.capgemini.onlineHotel.dto.HotelSearch;

public interface HotelMapper {

	public HotelEntity searchHotel(HotelSearch search);
}
