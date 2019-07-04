package com.prasanta;

import java.awt.*;
import java.applet.*;

   public class barchat extends Applet
   {
                  int n=0;
                  String label[];
                  int value[];

          public void init(){        
                  try{
                        n = Integer.parseInt(getParameter("totcol"));
                        label = new String[n];
                        value = new int[n];

                  label[0] = getParameter("lbl1");
                  label[1] = getParameter("lbl2");
                  label[2] = getParameter("lbl3");
                  label[3] = getParameter("lbl4");

                  value[0] = Integer.parseInt(getParameter("c1"));
                  value[1] = Integer.parseInt(getParameter("c2"));
                  value[2] = Integer.parseInt(getParameter("c3"));
                  value[3] = Integer.parseInt(getParameter("c4"));
                  }  catch(Exception e) {}
           }

       
          public void paint(Graphics g){
                for (int i=0;i<n ;i++ )
                {
                      g.setColor(Color.red);
                      g.drawString(label[i],20,(i*50)+30);
                      g.setColor(Color.blue);
                      g.fillRect(50,(i*50)+10,value[i],40);
                      g.drawString("    " +value[i],value[i]+50,(i*50)+30);
                }
           }     
                
   }