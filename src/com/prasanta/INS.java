package com.prasanta;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class INS extends Frame implements ActionListener
{  
	Frame f;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4,b5;
	Connection c=null;
	Statement s;
	ResultSet r;
	INS()
	{
		try
		{
			f=new Frame();
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(800,600);
			l1= new Label("ID");
			l1.setBounds(50,100,100,50);
			f.add(l1);
			l2=new Label("NAME");
			l2.setBounds(50,150,100,50);
			f.add(l2);
			t1=new TextField();
			t1.setBounds(150,100,100,40);
			f.add(t1);
			t2=new TextField();
			t2.setBounds(150,150,100,40);
			f.add(t2);
			b1=new Button("INSERT");
			b1.setBounds(300,150,100,40);
			f.add(b1);
			b1.addActionListener(this);
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c=DriverManager.getConnection("jdbc:odbc:dsn");
			System.out.println("connected");
			s=c.createStatement();

		}
		catch (Exception e)
		{
		}
	}//end of INS constructor
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource()==b1)
			{
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:dsn","","");
			Statement s=con.createStatement();
                        int y= Integer.parseInt(t2.getText());
                        int x=Integer.parseInt(t1.getText());
                        System.out.println("x=   "+x);
                        System.out.println("y="+y);
			            String sq="insert into pass(userid,password) values("+x+","+y+")";
                        
                        int count=s.executeUpdate(sq);
                        System.out.println(count+"row inserted");
			s.close();
			con.close();
				System.out.println("complete");
			}
			s.close();
		c.close();

				
			}
		
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[])
	{

	new INS();
	}
}