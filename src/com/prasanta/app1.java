package com.prasanta;

import java.applet.*;
import java.awt.*;
//<applet code="app1" width=200 height=100>
public class app1 extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
		
	}
	public void paint(Graphics g)
	{
		Font f= new Font("AkrutiOriBallava-99",Font.BOLD,80);
		g.setFont(f);
		g.drawString("_�g�� K�c�e _e�W��",100,200);
	}
}