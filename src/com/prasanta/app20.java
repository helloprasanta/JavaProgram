package com.prasanta;

import java.awt.*;
import java.applet.*;
/*<applet code="app20" width=500 height=500>
</applet>*/
public class app20 extends Applet
{
	Label l;
	int f,f1,fib,i;
	String str=" ";
	public void init()
	{
		l=new Label();
		f=0;
		f1=0;
		fib=0;
		for(i=1;i<=10;i++)
		{
			str=str+fib+",";
			f=f1;
			fib=f+f1;
		}
		l.setText(str);
		setLayout(new FlowLayout());
		add(l);
	}
}