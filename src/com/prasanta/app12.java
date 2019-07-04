package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="app12" width=500 height=500>
</applet> */
public class app12 extends Applet implements ActionListener

{
	Checkbox c1,c2,c3,c4;
	CheckboxGroup cbg1,cbg2;
	TextField name= new TextField(20);
	TextField age= new TextField(3);
	TextField adr= new TextField(30);
	public void init()
	{
		
		Label namep= new Label("Name");
		Label agep= new Label("Age");
		Label address= new Label("Adress");
		Label gender=new Label("Gender");
		Label marital= new Label("MaritalStatus");
		cbg1= new CheckboxGroup();
		cbg2= new CheckboxGroup();
		c1= new Checkbox("Male",cbg1,false);
		c2= new Checkbox("Female",cbg1,false);
		c3= new Checkbox("Married",cbg2,false);
		c4= new Checkbox("Unmarried",cbg2,false);
		Button b= new Button("OK");
		add(namep);
		add(name);
		add(agep);
		add(age);
		add(address);
		add(adr);
		add(gender);
		add(c1);
		add(c2);
		add(marital);
		add(c3);
		add(c4);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
		public void paint(Graphics g)
	{
		g.drawString("Your Name is"+name.getText(),6,60);
		g.drawString("Your Age is"+age.getText(),6,70);
		g.drawString("Your Adress is"+adr.getText(),6,80);
		g.drawString("Gender"+cbg1.getSelectedCheckbox().getLabel(),6,100);
		g.drawString("Marital Satus"+cbg2.getSelectedCheckbox().getLabel(),6,130);
	}
}





