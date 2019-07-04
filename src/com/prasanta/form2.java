package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
public class form2 extends Applet implements ActionListener

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
			Connection con=DriverManager.getConnection("jdbc:odbc:datasource1"," "," ");
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("Select *from T1");	

			
			name.setText("hello");
			while(rs.next())
			{
				int i=rs.getInt("ID");
				int j=rs.getInt("number");
				name.setText(" "+i);
				pass.setText(" "+j);
				
			}
			st.close();
		con.close();

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());

		}
	

			
		
	}
	public void paint(Graphics g)
		{
			g.drawString("NAME"+name.getText(),6,60);
			g.drawString("Password"+pass.getText(),6,100);
		}
}