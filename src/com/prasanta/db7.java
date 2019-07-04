package com.prasanta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class db7 extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	Container cop=getContentPane();
	JLabel l1=new JLabel("Cus Id");
	JLabel l2=new JLabel("Cus Name");
	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();
	JButton b1=new JButton("save");
	JLabel l3=new JLabel("Submit");
	db7()
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
			b1.setBounds(250,200,75,25);

			cop.add(l1);cop.add(tf1);
			cop.add(l2);cop.add(tf2);
			cop.add(l3);cop.add(b1);
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						con=DriverManager.getConnection("jdbc:odbc:dsn4");
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
					String id=tf1.getText();
					String name=tf2.getText();
					if(id.equals("") || name.equals(""))
					{
						JOptionPane .showMessageDialog(null,"id or name can't be blank");
					}
					else
					{
						st.executeUpdate("insert into customer values('"+id+"','"+name+"')");
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
		new db7();
	}
}
