package com.prasanta;

import java.sql.*;
class db1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dsn7"," "," ");
			Statement st=con.createStatement();
			String sq="insert into prasanta values(7,'sures')";
			int count=st.executeUpdate(sq);
			System.out.println(count+"row inserted");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
		}
	}
}