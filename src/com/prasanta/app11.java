package com.prasanta;

import java.awt.*;
import java.applet.*;
/*
<applet code="app11" width=200 height=200>
</applet>
*/
public class app11 extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0;i<=250;i++)
		{
			Color c1=new Color(35-i,55-i,110-i);
			g.setColor(c1);
			g.drawRect(250+i,250+i,100+i,100+i);
			g.drawOval(100+i,100+i,50+i,50+i);
			g.drawLine(50+i,20+i,10+i,10+i);
		}
	}
}
