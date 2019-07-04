package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
public class form1 extends Applet implements ActionListener

{
	String msg;
	TextField name= new TextField(20);
	TextField pass= new TextField(10);
	public void init()
	{
		
		Label namep= new Label("Name");
		Label passp= new Label("password");
		Button b= new Button("OK");
		add(namep);
		add(name);
		add(passp);
		add(pass);
		add(b);
		b.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae)
	{
			try
			{
	
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dsn4"," "," ");
			Statement st=con.createStatement();
			String sq="create table password(uname VARCHAR(15),pname VARCHAR(15))";
			st.executeUpdate(sq);
			System.out.println("Table Created");
			st.close();
			con.close();
			}
			catch(Exception e)
		{
		}

			try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dsn4"," "," ");
			Statement st=con.createStatement();
			String sq="insert into prasanta values(name.getText(),pass.getText())";
			int count=st.executeUpdate(sq);
			msg="Query Completed";
			st.close();
			con.close();
		}
		catch(Exception e)
		{
		}
		repaint();
	}
		public void paint(Graphics g)
		{
			g.drawString("Your Name is"+name.getText(),6,60);
		g.drawString("Your password is"+pass.getText(),9,80);
		}
	}