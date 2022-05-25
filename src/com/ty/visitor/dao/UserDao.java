package com.ty.visitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.ty.visitor.util.ConnectionObject;

public class UserDao {

	public int saveUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id"); int id = sc.nextInt() ;sc.nextLine() ;
		System.out.println("Enter user name"); String name = sc.nextLine() ;
		System.out.println("Enter user email"); String email = sc.nextLine() ;
		System.out.println("Enter user phone"); long phone = sc.nextLong() ; sc.nextLine() ;
		System.out.println("Enter user password"); String password = sc.nextLine() ;
		System.out.println("Enter user role"); String role = sc.nextLine() ;
				
		String sql = String.format("insert into user values(%d, '%s', '%s',%d ,'%s', '%s')",id ,name,email ,phone, password, role ) ;
		
		Connection	connection = ConnectionObject.getConnection() ;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
}
