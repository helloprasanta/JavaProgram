package com.prasanta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class form3 extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	Container cop=getContentPane();
	JLabel l1=new JLabel("ID :");
	JLabel l2=new JLabel("NAME :");
	JLabel l3=new JLabel("Email :");
	JLabel l4=new JLabel("MOBILE :");

	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();
	JTextField tf3=new JTextField();
	JTextField tf4=new JTextField();
	JButton b1=new JButton("save");
	JButton b2=new JButton("Submit");
	form3()
	{
		try{
			setVisible(true);
			setSize(800,600);
			setLayout(null);
			l1.setBounds(100,100,100,30);
			tf1.setBounds(220,100,100,30);
			l2.setBounds(100,150,100,30);
			tf2.setBounds(220,150,100,30);
			l3.setBounds(100,200,100,30);
			tf3.setBounds(220,200,100,30);
			l3.setBounds(100,250,100,30);
			tf4.setBounds(220,250,100,30);
			l4.setBounds(100,300,100,30);
			b1.setBounds(400,200,75,25);

			cop.add(l1);cop.add(tf1);
			cop.add(l2);cop.add(tf2);
			cop.add(l3);
			cop.add(tf3);
			cop.add(l4);
			cop.add(tf4);
			cop.add(b1);

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						con=DriverManager.getConnection("jdbc:odbc:dsn8");
						  st=con.createStatement();
						// rs= st.executeQuery("Select * from customer");
						/*while(rs.next())
						{
							int i=rs.getInt("cid");
							String nm=rs.getString("cname");
							System.out.println("id="+i+"Name="+nm);
						}*/
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					try{
					String ID1=tf1.getText();
					String name=tf2.getText();
					if(ID1.equals("") || name.equals(""))
					{
						JOptionPane .showMessageDialog(null,"ID1 or name can't be blank");
					}
					else
					{
						st.executeUpdate("insert into customer values('"+ID1+"','"+name+"')");
						tf1.setText("");
						tf2.setText("");

						JOptionPane .showMessageDialog(null,"Data entered sussefully");
					}
						}catch(Exception e){}

				}
			});

			}catch(Exception e){}
	}
	public static void main(String[] args)
	{
		new form3();
	}
}
