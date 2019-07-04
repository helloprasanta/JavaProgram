package com.prasanta;

import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*< applet code="app14" width=500 height=500>
</applet>*/
class MenuFrame extends Frame
{
	MenuFrame(String title)
	{
		super(title);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		Menu file= new Menu("File");
		MenuItem i1,i2,i3,i4;
		file.add(i1=new MenuItem("New"));
		file.add(i2=new MenuItem("Open"));
		file.add(i3=new MenuItem("Close"));
		file.add(i4=new MenuItem("Quit"));
		mbar.add(file);
		Menu edit=new Menu("Edit");
		MenuItem i5,i6,i7,i8;
		edit.add(i5= new MenuItem("Cut"));
		edit.add(i6= new MenuItem("Copy"));
		edit.add(i7= new MenuItem("Paste"));
		edit.add(i8= new MenuItem(" "));
		Menu sub= new Menu("Special");
		MenuItem i9,i10,i11;
		sub.add(i9= new MenuItem("Frist"));
		sub.add(i10= new MenuItem("Second"));
		sub.add(i11=new MenuItem("Third"));
		edit.add(sub);
		mbar.add(edit);
	}
}
public class app14 extends Applet
{
	Frame f;
	public void init()
	{
		f=new MenuFrame("app14");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
}
