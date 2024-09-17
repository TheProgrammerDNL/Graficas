package Graficas;

import java.awt.*;

public class Pixel {
   public static void dibujarPixel(int x, int y, Graphics g){
      g.fillRect(x,y,1,1);
   }
   public static void dibujarPixel(int x, int y, Color c, Graphics g){
      g.setColor(c);
      g.fillRect(x,y,1,1);
   }
   public static void dibujarPixel(int x, int y, int grosor, Graphics g){
      g.fillRect(x,y,grosor,grosor);
   }
   public void dibujarPixel(int x, int y, int grosor, Color c, Graphics g){
      g.setColor(c);
      g.fillRect(x,y,grosor,grosor);
   }
}