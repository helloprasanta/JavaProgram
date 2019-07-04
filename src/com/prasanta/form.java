package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class form extends Applet implements ActionListener
{ 
		String msg;
	TextField name=new TextField(12);
		TextField pass=new TextField(10);
	public void init()
	{
		Label namep=new Label("NAME");
		Label passp=new Label("PASSWORD");
		Button b= new Button("OK");
				add(namep);
		add(name);
		add(passp);
		add(pass);
		add(b);
		b.addActionListener(this);
		name.addActionListener(this);
		pass.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae)
		{
			repaint();
		}
		public void paint(Graphics g)
		{
			g.drawString("NAME"+name.getText(),6,60);
			g.drawString("Password"+pass.getText(),6,100);
		}
	}
