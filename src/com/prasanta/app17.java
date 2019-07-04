package com.prasanta;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="app17" width=500 height=500>
</applet> */
public class app17 extends Applet implements ActionListener
{
	Choice date,month,year;
	String msg=" ";
	public void init()
	{
		Label datep=new Label("DATE");
		Label monthp=new Label("MONTH");
		Label yearp=new Label("YEAR");
		date =new Choice();
		month=new Choice();
		year=new Choice();
		Button b=new Button("OK");
		date.add("01");
		date.add("02");
		date.add("03");
		date.add("04");
		date.add("05");
		date.add("06");
		date.add("07");
		date.add("08");
		date.add("09");
		date.add("10");
		date.add("11");
		date.add("12");
		date.add("13");
		date.add("14");
		date.add("15");
		date.add("16");
		date.add("17");
		date.add("18");
		date.add("19");
		date.add("20");
		date.add("21");
		date.add("22");
		date.add("23");
		date.add("24");
		date.add("25");
		date.add("26");
		date.add("27");
		date.add("28");
		date.add("29");
		date.add("30");
		date.add("31");
		month.add("Jan");
		month.add("Feb");
		month.add("Mar");
		month.add("Apr");
		month.add("May");
		month.add("Jun");
		month.add("Jul");
		month.add("Aug");
		month.add("Sep");
		month.add("Oct");
		month.add("Nov");
		month.add("Dec");
		year.add("1993");
		year.add("1994");
		year.add("1995");
		year.add("1996");
		year.add("1997");
		add(datep);
		add(date);
		add(monthp);
		add(month);
		add(yearp);
		add(year);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Your Date Of Birth Is : ";
		msg+=date.getSelectedItem();
		msg+="/";
		msg+=month.getSelectedItem();
		msg+="/";
		msg+=year.getSelectedItem();
		g.drawString(msg,6,120);
	}
}