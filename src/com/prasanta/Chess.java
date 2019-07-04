package com.prasanta;

import java.awt.*;
import java.applet.*;
public class Chess extends Applet {
   public void paint(Graphics g) {
      
      int row;   // Row number, from 0 to 7
      int col;   // Column number, from 0 to 7
      int x,y;   // Top-left corner of square
   
      for ( row = 0;  row < 20;  row++ ) {
      
         for ( col = 0;  col < 20;  col++) {
            x = col * 20;
            y = row * 20;
            if ( (row % 2) == (col % 2) )
               g.setColor(Color.green);
            else
               g.setColor(Color.black);
            g.fillRect(x, y, 20, 20);
         } 
      } 
   } 
}