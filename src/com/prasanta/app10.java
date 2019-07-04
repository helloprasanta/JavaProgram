package com.prasanta;

import java.awt.*;
import java.applet.*;
public class app10 extends Applet
{
	AudioClip c;
	Image im;
      public void paint (Graphics g)
{
im=getImage(getCodeBase(),"facebook1.jpg");
g.drawImage(im,20,50,this);
}
	public void init()
	{
		c=getAudioClip(getCodeBase(),"a.wav");
	}
		public void start()
	{
			c.play();
	}
}
	