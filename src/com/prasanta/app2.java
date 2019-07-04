package com.prasanta;

import java.awt.*;
import java.applet.*;
/* <applet code="app2" width=200 height=100>
<param name=fontName value=courier>
<param name=fontSize value=20>
</applet> */
public class app2 extends Applet
{
	String fName;
	int fSize;
	public void start()
	{
		String p;
		fName=getParameter("fontName");
		if(fName==null)
			fName="Not Found";
		p=getParameter("fontSize");
		if(p!=null)
			fSize=Integer.parseInt(p);
		else
			fSize=0;
	}
	public void paint(Graphics g)
	{
		g.drawString("FontName="+fName,0,20);
		g.drawString("Font Size="+fSize,0,80);
	}
}