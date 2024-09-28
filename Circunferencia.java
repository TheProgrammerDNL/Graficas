package Graficas;

import java.awt.*;

public class Circunferencia {
   
   Pixel p = new Pixel();
   
   // r = sqrt(x^2+y^2)
   public void algoritmoGeneral(int xc, int yc, int radio, Graphics g) {
      int x;
      double y1, y2;
      for (x = xc-radio; x<=xc+radio; x+=2) {
         y1 = yc + Math.sqrt(Math.pow(radio, 2) - Math.pow(x-xc, 2));
         y2 = yc - Math.sqrt(Math.pow(radio, 2) - Math.pow(x-xc, 2));
         p.dibujarPixel(x, (int) Math.round(y1), g);
         p.dibujarPixel(x, (int) Math.round(y2), g);
      }
      System.out.println("algoritmoGeneral");
   }
   
   // x = cos(t)
   // y = sen(t)
   public void algoritmoIncremental(int xc, int yc, int radio, Graphics g) {
      int tx,ty;
      double dt, cc, ss, x, y, aux;
      dt = (double) 1/radio;
      cc = Math.cos(dt);
      ss = Math.sin(dt);
      x=0;
      y=radio;
      while (y >= Math.abs(x)) {
         tx = (int) Math.round(x);
         ty = (int) Math.round(y);
         p.dibujarPixel(xc+tx, yc+ty, g);
         p.dibujarPixel(xc-tx, yc+ty, g);
         p.dibujarPixel(xc+tx, yc-ty, g);
         p.dibujarPixel(xc-tx, yc-ty, g);
         p.dibujarPixel(xc+ty, yc+tx, g);
         p.dibujarPixel(xc-ty, yc+tx, g);
         p.dibujarPixel(xc+ty, yc-tx, g);
         p.dibujarPixel(xc-ty, yc-tx, g);
         aux = x;
         x = x*cc - y*ss;
         y = y*cc + aux*ss;
      }
      System.out.println("algoritmoIncremental");
   }
   
   // Sólo trabaja con enteros.
   public void algoritmoBresenham(int xc, int yc, int radio, Graphics g) {
      int pp,x,y;
      x=0;
      y=radio;
      pp=3 - 2*radio;
      while (x<=y) {
         p.dibujarPixel(xc+x, yc+y, g);
         p.dibujarPixel(xc-x, yc+y, g);
         p.dibujarPixel(xc+x, yc-y, g);
         p.dibujarPixel(xc-x, yc-y, g);
         p.dibujarPixel(xc+y, yc+x, g);
         p.dibujarPixel(xc-y, yc+x, g);
         p.dibujarPixel(xc+y, yc-x, g);
         p.dibujarPixel(xc-y, yc-x, g);
         
         if (pp < 0) {
            pp = pp + 4*x + 6;
         } else {
            pp = pp+4*(x-y) + 10;
            y--;
         }
         
         x++;
         
      }
      System.out.println("algoritmoBresenham");
   }
}