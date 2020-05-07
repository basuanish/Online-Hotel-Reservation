package com.capgemini.onlineHotel.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capgemini.onlineHotel.DAO.BookingDAO;
import com.capgemini.onlineHotel.dto.BookingEntity;
import com.capgemini.onlineHotel.utils.DBUtilis;

public class BookingDAOImpl implements BookingDAO {
	public String addBookingTransaction(BookingEntity bookingEntity) throws Exception{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DBUtilis.getInstance().getConnection();
		} catch (SQLException exception) {
			throw new Exception(exception.getMessage());
		}
		
		try {

			String query = "INSERT INTO Bookings (BOOKING_DATE, USER_NAME, BOOKING_STATUS) VALUES (?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDate(2, bookingEntity.getBookingDate());
			preparedStatement.setString(3, bookingEntity.getUserName());
			preparedStatement.setString(4, bookingEntity.getBookingStatus());

			preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			throw new Exception(exception.getMessage());
		} finally {

			preparedStatement.close();
			connection.close();
		}


		return "booking transaction added successfully.";
	}
}
