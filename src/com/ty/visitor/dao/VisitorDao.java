package com.ty.visitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.visitor.dto.Visitor;
import com.ty.visitor.util.AES;
import com.ty.visitor.util.ConnectionObject;
import com.ty.visitor.util.UC;

public class VisitorDao {

	public static int saveVisitor(Visitor visitor) {
		
		String sql = "insert into visitor values(?,?,?,?,?,?)" ;
		Connection connection = ConnectionObject.getConnection() ;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, visitor.getId());
			
			String encName = AES.encrypt(visitor.getName(), UC.KEY);
			preparedStatement.setString(2, encName);
			String encEmail = AES.encrypt(visitor.getEmail(), UC.KEY);
			preparedStatement.setString(3, encEmail);
			String encPhone = AES.encrypt(visitor.getPhone(), UC.KEY);
			preparedStatement.setString(4, encPhone);
			
			preparedStatement.setInt(5,visitor.getAge());
			preparedStatement.setString(6, visitor.getGender());
		
			return preparedStatement.executeUpdate() ;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public Visitor getVisitorById() {
		
		Visitor visitor = new Visitor() ;
		return visitor ;
	}
	public Visitor getAllVisitorByDate() {
		
		Visitor visitor = new Visitor() ;
		return visitor ;
	}
	public Visitor getAllVisitorByAgeRange() {
		
		Visitor visitor = new Visitor() ;
		return visitor ;
	}
}
