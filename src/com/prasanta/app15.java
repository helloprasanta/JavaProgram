package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="app15" width=500 height=500>
</applet>*/
public class app15 extends Applet implements ActionListener
{
	TextField name,pass;
	public void init()
	{
		Label namep=new Label("Name");
		Label passp=new Label("Password");
		name= new TextField(12);
		pass= new TextField(8);
		pass.setEchoChar('*');
		Button b=new Button("OK");
		add(namep);
		add(name);
		add(passp);
		add(pass);
		add(b);
		name.addActionListener(this);
		pass.addActionListener(this);
		b.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae)
	{
			repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name"+name.getText(),6,60);
		g.drawString("Selectd text in Name  "+name.getSelectedText(),6,80);
		g.drawString("Password   "+pass.getText(),6,100);
	}
}

