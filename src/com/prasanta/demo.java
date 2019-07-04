package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
public class demo extends Applet implements ActionListener
{ 
	TextField name,pass;
	String msg;
	public void init()
	{
		Label namep=new Label("NAME");
		Label passp=new Label("PASSWORD");
		Button b= new Button("OK");
		name=new TextField(12);
		pass=new TextField(10);
		pass.setEchochar('*');
		add(namep);
		add(name);
		add(passp);
		add(pass);
		add(b);
		b.addActionListener(this);
		name.addActionListener(this);
		pass.addActionListener(this);
		public void actionPerformed(ActionEvent ae)
		{
			try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dsn4"," "," ");
			Statement st=con.createStatement();
			String sq="create table prasanta(uname VARCHAR(15),cname VARCHAR(15))";
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
		}
	}
		public void paint(Graphics g)
		{
			g.drawString(msg,50,475);
		}
	}

