package com.capgemini.onlineHotel.daoImpl;

import org.apache.ibatis.session.SqlSession;

import com.capgemini.onlineHotel.dao.HotelDAO;
import com.capgemini.onlineHotel.dto.HotelEntity;
import com.capgemini.onlineHotel.dto.HotelSearch;
import com.capgemini.onlineHotel.mappers.HotelMapper;
import com.capgemini.onlineHotel.utils.MyBatisUtil;

public class HotelDAOImpl implements HotelDAO {

	public HotelEntity searchHotel(HotelSearch search) {
		 SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		 try{
			  HotelMapper hotelMapper = session.getMapper(HotelMapper.class);
			  return hotelMapper.searchHotel(search);
	}
		 finally{
			   session.close();
			  }
}
}
