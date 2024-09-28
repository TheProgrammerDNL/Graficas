package Graficas;

import java.awt.*;

public class LineaFalla {
   
   Pixel p = new Pixel();
   
   public void dibujarLinea(int x1, int y1, int x2, int y2, Graphics g) {
      
      //Don't delete, probably gonna use.
      int x = x1;
      int y = y1;
      
      if (x1 == x2) {   //m = infinity
         for (int y=y1; y<=y2; y++) {
            p.dibujarPixel(x,y,g);
         }
      } else if (y1 == y2) {  //m = 0
         for (int x=x1; x<=x2; x++) {
            p.dibujarPixel(x,y,g);
         }
      } else if ((y2-y1)/(x2-x1 == 1)) {  //m = 1
         for (int i=0; i<x2; i++) {
            y--;
            x++;
            p.dibujarPixel(x,y,g);
         }
      } else if ((y2-y1)/(x2-x1 == -1)) { //m = -1
         for (int i=0; i<x2; i++) {
            y++;
            x++;
            p.dibujarPixel(x,y,g);
         }
      } else { 
         //Algoritmo de Bresenham
         List<int[]> puntos = new ArrayList<>();
         
         int dx = Math.abs(x2 - x1);
         int dy = Math.abs(y2 - y1);
         
         int sx = (x1 < x2) ? 1 : -1;
         int sy = (y1 < y2) ? 1 : -1;
         
         int err = dx - dy;

         while (true) {
            // Agregar el punto actual a la lista
            puntos.add(new int[]{x1, y1});

            // Si llegamos al punto final, detenernos
            if (x1 == x2 && y1 == y2) {
                break;
            }

            int e2 = 2 * err;

            // Ajustar los errores y mover en la dirección adecuada
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
         }
      }
   }
   
   public static List<int[]> bresenham(int x1, int y1, int x2, int y2) {
        List<int[]> puntos = new ArrayList<>();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        int err = dx - dy;

        while (true) {
            // Agregar el punto actual a la lista
            puntos.add(new int[]{x1, y1});

            // Si llegamos al punto final, detenernos
            if (x1 == x2 && y1 == y2) {
                break;
            }

            int e2 = 2 * err;

            // Ajustar los errores y mover en la dirección adecuada
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }

        return puntos;
    }
}