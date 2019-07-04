package com.prasanta;

import java.sql.*;
class db2
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dsn7"," "," ");
			Statement st=con.createStatement();
			String sq="create table prasanta(cid INT,cname VARCHAR(15))";
			st.executeUpdate(sq);
			System.out.println("Table Created");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
		}
	}
}