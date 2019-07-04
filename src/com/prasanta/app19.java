package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="app19" width=500 height=500>
</applet> */
public class app19 extends Applet implements ActionListener
{
	Choice operator,circle;
	TextField mobn,amount;
	String msg=" ";
	public void init()
	{
		TextField mobn=new TextField(30);
		TextField amount=new TextField(5);
		Label mobnp=new Label("Mobile Number");
		Label amountp=new Label("Amount");
		Label operatorp=new Label("OPERATOR");
		Label circlep=new Label("CIRCLE");
	    operator=new Choice();
		circle=new Choice();
	    Button b=new Button("OK");
		operator.add("Airtel");
		operator.add("Aircel");
		operator.add("Idea");
		operator.add("Vodafone");
		operator.add("Reliance");
		operator.add("TataIndicom");
		operator.add("TataDOCOMO");
		operator.add("MTS");
		operator.add("Uninor");
		operator.add("Virgin");
		circle.add("Assam");
		circle.add("Bihar");
		circle.add("Chhatisgargh");
		circle.add("Delhi");
		circle.add("Gujurat");
		circle.add("Hariyana");
		circle.add("JammuKashmir");
		circle.add("Karnatak");
		circle.add("Maharastra");
		circle.add("Orissa");
		circle.add("Punjab");
		circle.add("Rajastan");
		circle.add("Tamilnadu");
		circle.add("Uttarpradesh");
	    add(mobnp);
		add(mobn);
		add(operatorp);
		add(operator);
		add(circlep);
		add(circle);
		add(amountp);
		add(amount);
		add(b);
		mobn.addActionListener(this);
		amount.addActionListener(this);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		
		msg="Your Oerator Is";
		msg+=operator.getSelectedItem();
		msg+="Your circle is";
		msg+=circle.getSelectedItem();
		g.drawString(msg,6,120);
		
	}
}