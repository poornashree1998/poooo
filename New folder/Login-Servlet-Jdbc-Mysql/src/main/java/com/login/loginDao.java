package com.login;

import java.sql.*;

public class loginDao {
	
	public static boolean logininform(login login)
	{
		String query = "insert into login(username,password) values(?,?);";
		int count=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Poorna@09");
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,login.getUsername());
		ps.setString(2,login.getPassword());
		System.out.println(ps);
		count =ps.executeUpdate();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return true;
		
	}

}
