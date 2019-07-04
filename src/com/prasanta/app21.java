package com.prasanta;

import java.awt.*;
import java.swing.*;
import java.applet.*;
/*<applet code="app21" width=500 height=500>
</applet>*/
public class app21 extends JApplet
{
	JButton b1=new JButton("ONE");
	JButton b2=new JButton("TWO");
	JComboBox c1=new JComboBox();
	public void init()
	{
		Container con=getContentPane();
		JToolBar jb=new JToolBar();
		jb.add(b1);
		jb.add(b2);
		jb.add(c1);
	}
}
