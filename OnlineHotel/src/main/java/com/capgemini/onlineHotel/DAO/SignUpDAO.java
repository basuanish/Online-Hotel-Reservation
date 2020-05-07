package com.capgemini.onlineHotel.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capgemini.onlineHotel.utils.DBUtilis;



public class SignUpDAO {
	
	


public void insertData(String firstName, String lastName, String userName,
        String password, String email, String phone) throws Exception {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	connection = DBUtilis.getInstance().getConnection();

	try {

		

		String query = "INSERT INTO SignUp(firstname,lastname,username,password,email,phone)" ;
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, userName);
		preparedStatement.setString(4, password);
		preparedStatement.setString(5, email);
		preparedStatement.setString(6, phone);
		
		preparedStatement.executeUpdate();

	} catch (SQLException exception) {
		throw (exception);
	} finally {

		preparedStatement.close();
		connection.close();
	}
	
}
}