package com.prasanta;

import java.awt.*;
import java.applet.*;
/* <applet code="app16" width=500 height=500>
</applet>*/
public class app16 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,100,200);
		g.drawRect(10,10,60,50);
		g.fillRect(100,10,60,50);
		g.drawRoundRect(190,10,60,50,15,15);
		g.fillRoundRect(70,90,140,100,30,40);
	}
}