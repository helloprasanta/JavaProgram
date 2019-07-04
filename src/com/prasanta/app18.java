package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="app18" width=500 height=500>
</applet> */
public class app18 extends Applet implements ActionListener
{
	Choice operator,circle;
	TextField mobn,amount;
	public void init()
	{
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
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("You Rcharged For Number"+mobn.getText()+" having operator"+operator.getSelectedItem()+"in Circle"+circle.getSelectedItem()+"with amount"+amount.getText(),6,100); 
	}
}
