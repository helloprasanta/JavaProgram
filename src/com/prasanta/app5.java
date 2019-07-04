package com.prasanta;

import java.awt.*;
import java.applet.*;
public class app5 extends Applet
{
	AudioClip c;
	public void init()
	{
		c=getAudioClip(getCodeBase(),"a.wav");
	}
		public void start()
	{
			c.play();
	}
}
	