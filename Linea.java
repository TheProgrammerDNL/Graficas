package Graficas;

import java.awt.*;

public class Linea {

   private static Pixel px;
   
   public void dibujarLinea(int x0, int y0, int x1, int y1, int grosor, Graphics g) {
        int dx = x1 - x0;
        int dy = y1 - y0;
        int cantPixeles = Math.max(Math.abs(dx), Math.abs(dy));
        px = new Pixel();

        float xInc = (float) dx / cantPixeles;
        float yInc = (float) dy / cantPixeles;

        float x = x0;
        float y = y0;

        for (int i = 0; i <= cantPixeles; i++) {
            px.dibujarPixel(Math.round(x), Math.round(y), grosor, g);
            x += xInc;
            y += yInc;
        }
    }
}