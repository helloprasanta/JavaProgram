package com.prasanta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class db3 extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	Container cop=getContentPane();
	JLabel l1=new JLabel("Cus Id");
	JLabel l2=new JLabel("Cus Name");
	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();
	JButton b1=new JButton("Save");
	JLabel l3=new JLabel("");
	JButton b2=new JButton("Update");
	JButton b3=new JButton("Delete");
	JButton b4=new JButton("Show");


	db3()
	{
 	super(" Ankita-Khagendra-Suresh BANK, Balasore");

		try{
			setVisible(true);
			setSize(800,600);
			setLayout(null);
			l1.setBounds(100,100,100,30);
			tf1.setBounds(220,100,100,30);
			l2.setBounds(100,150,100,30);
			tf2.setBounds(220,150,100,30);
			l3.setBounds(100,200,100,30);
			b1.setBounds(220,200,70,25);
			b2.setBounds(300,200,75,25);
			b3.setBounds(380,200,70,25);
			b4.setBounds(460,200,70,25);


			cop.add(l1);cop.add(tf1);
			cop.add(l2);cop.add(tf2);
			cop.add(l3);cop.add(b1);cop.add(b2);cop.add(b3);cop.add(b4);
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						con=DriverManager.getConnection("jdbc:odbc:dsn13");
						  st=con.createStatement();

			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					try{
					long id=Integer.parseInt(tf1.getText());
					String name=tf2.getText();

					rs=st.executeQuery("select * from customer where cid="+id+"");
						if(rs.next())
						{
							JOptionPane .showMessageDialog(null,"Record exist");
						}
					else if(id==32 || name.equals(""))
					{
						JOptionPane.showMessageDialog(null,"id or name can't be blank");
					}
					else
					{
						st.executeUpdate("insert into customer values('"+id+"','"+name+"')");
						tf1.setText("");
						tf2.setText("");

						JOptionPane.showMessageDialog(null,"Data entered sussefully");
					}
				}
				catch(Exception e){}

				}
			});

			b2.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								try{
								long id=Integer.parseInt(tf1.getText());
								String name=tf2.getText();
								rs=st.executeQuery("select * from customer where cid="+id+"");
								if(!rs.next())
									{
										JOptionPane .showMessageDialog(null,"The id u r entered is not exist");
									}
								else if(id==32 || name.equals(""))
								{
									JOptionPane.showMessageDialog(null,"id or name can't be blank");
								}
								else
								{
									System.out.println("ok1");
									String s="update customer set cname='"+name+"' where cid="+id+"";
									System.out.println(s);
									st.executeUpdate(s);
									tf1.setText("");
									tf2.setText("");
									JOptionPane.showMessageDialog(null,"Data updated sussefully");
															while(rs.next())
															{
																int i=rs.getInt("cid");
																String nm=rs.getString("cname");
																tf1.setText("");
																tf2.setText("");
															}
								 }
							}
							catch(Exception e){}

						}
			});


			b3.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent ae)
										{
											try{
											long id=Integer.parseInt(tf1.getText());
											String name=tf2.getText();
											if(id==32)
											{
												JOptionPane.showMessageDialog(null,"id  can't be blank");
											}
											else
											{
												rs=st.executeQuery("select * from customer where cid="+id+"");
												if(!rs.next())
												{
													JOptionPane .showMessageDialog(null,"No record found");
												}
												else
												{
												String s="Delete from customer where cid="+id+"";
												System.out.println(s);
												st.executeUpdate(s);
												tf1.setText("");
												tf2.setText("");
												JOptionPane .showMessageDialog(null,"Data Deleted");
																		while(rs.next())
																		{
																			int i=rs.getInt("cid");
																			String nm=rs.getString("cname");
																			tf1.setText("");
																			tf2.setText("");
																		}
												}
											}
										}
										catch(Exception e){}
									}
			});


			b4.addActionListener(new ActionListener()
			 {
				public void actionPerformed(ActionEvent ae)
				{
					try
					{
						long id=Integer.parseInt(tf1.getText());
						if(id==32)
						{
							JOptionPane.showMessageDialog(null,"id cann't blank");
						}
					else
					{
						rs=st.executeQuery("select * from customer where cid="+id+"");
						if(!rs.next())
						{
							JOptionPane.showMessageDialog(null,"the id does not exist, please enter a valid id");
						}
						else
						{
							String s="select cname,cid from customer";
							System.out.println(s);
							st.executeUpdate(s);
							tf1.setText("");
							tf2.setText("");
							JOptionPane .showMessageDialog(null,"details information");
								while(rs.next())
									{
										int i=rs.getInt("cid");
										String nm=rs.getString("cname");
										tf1.setText("");
										tf2.setText("");
									}
								}
							}
						}
							catch (Exception e){}
						}
					});

			}catch(Exception e){}
	}
	public static void main(String[] args)
	{
		new db3();
	}
}
