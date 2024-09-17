package Graficas;

import java.awt.*;
import javax.swing.*;

public class Prueba extends JFrame {
   Pixel p;
   Circunferencia c;
   int ancho = 1000;
   int alto = 700;
   
   public Prueba() {
      p = new Pixel();
      c = new Circunferencia();
      setSize(ancho, alto);   //800 * 700   //1000, 700
      setTitle("Práctica Gráfica 3 - Daniel Díaz Larios");
      getContentPane().setBackground(Color.white);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void paint(Graphics g) {
      super.paint(g);
      c.algoritmoGeneral(500, 350, 200, g);
      c.algoritmoIncremental(500, 350, 100, g);
      c.algoritmoBresenham(500, 350, 150, g);
      //p.dibujarPixel(500, 350, 20, g);
   }
   
   public static void main(String args[]) {
      new Prueba();
   }
}