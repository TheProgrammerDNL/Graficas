package Graficas;

import java.awt.*;
import javax.swing.*;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class PractGraf_8 extends JFrame {
   
   //Resolución de esta computadora:
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   int anchoTot = (int) dim.getWidth();   //1536
   int altoTot = (int) dim.getHeight();   //864
   
   Pixel p;
   Linea l;
   Circunferencia c;
   
   int ancho = 750;
   int alto = 300;
   
   BufferedImage bi = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
   Graphics big = bi.createGraphics();
   
   public PractGraf_8() {
      p = new Pixel();
      l = new Linea();
      c = new Circunferencia();
      setSize(ancho, alto);
      setTitle("Práctica Gráfica 3 - Daniel Díaz Larios");
      getContentPane().setBackground(Color.white);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }
   
   public void paint(Graphics g) {
      super.paint(g);
      super.paint(big);
      
      dibujar(g);
      dibujar(big);
      
      //Guardando imagen...
      try {
         ImageIO.write(bi, "jpg", new File("PractGraf_8.jpg"));
         System.out.println("Se ha guardado la imagen correctamente ;)");
      } catch (IOException e) {
         System.out.println("Algo salió mal :(");
      }
   }
   
   private void dibujar(Graphics g) {
      //GRAFICANDO CON LA CLASE LINEA
      //Cuadrado
      l.dibujarLinea(100,100,100,200,5,g);
      l.dibujarLinea(100,200,200,200,5,g);
      l.dibujarLinea(200,200,200,100,5,g);
      l.dibujarLinea(200,100,100,100,5,g);
      
      //Líneas verticales y horizontales
      l.dibujarLinea(150,100,150,200,5,g);
      l.dibujarLinea(100,150,200,150,5,g);
      
      //Líneas Diagonales
      l.dibujarLinea(100,100,200,200,5,g);
      l.dibujarLinea(200,100,100,200,5,g);
      
      //Otras líneas
      l.dibujarLinea(100,125,200,175,5,g);
      l.dibujarLinea(100,175,200,125,5,g);
      l.dibujarLinea(125,100,175,200,5,g);
      l.dibujarLinea(175,100,125,200,5,g);
      
      
      //Flecha
      l.dibujarLinea(300,125,300,175,5,g);
      l.dibujarLinea(300,125,400,125,5,g);
      l.dibujarLinea(300,175,400,175,5,g);
      l.dibujarLinea(400,125,400,100,5,g);
      l.dibujarLinea(400,175,400,200,5,g);
      l.dibujarLinea(400,100,450,150,5,g);
      l.dibujarLinea(400,200,450,150,5,g);
      
      //Cosa rara
      l.dibujarLinea(500,100,500,200,5,g);
      l.dibujarLinea(500,100,650,100,5,g);
      l.dibujarLinea(500,200,650,200,5,g);
      l.dibujarLinea(650,100,500,160,5,g);
      l.dibujarLinea(650,200,500,160,5,g);
      
      
      //GRAFICANDO CON GRAPHICS
      g.setColor(Color.red);
      //Cuadrado
      g.drawLine(100,100,100,200);
      g.drawLine(100,200,200,200);
      g.drawLine(200,200,200,100);
      g.drawLine(200,100,100,100);
      
      //Líneas verticales y horizontales
      g.drawLine(150,100,150,200);
      g.drawLine(100,150,200,150);
      
      //Líneas Diagonales
      g.drawLine(100,100,200,200);
      g.drawLine(200,100,100,200);
      
      //Otras líneas
      g.drawLine(100,125,200,175);
      g.drawLine(100,175,200,125);
      g.drawLine(125,100,175,200);
      g.drawLine(175,100,125,200);
      
      
      //Flecha
      g.drawLine(300,125,300,175);
      g.drawLine(300,125,400,125);
      g.drawLine(300,175,400,175);
      g.drawLine(400,125,400,100);
      g.drawLine(400,175,400,200);
      g.drawLine(400,100,450,150);
      g.drawLine(400,200,450,150);
      
      //Triángulos
      g.drawLine(500,100,500,200);
      g.drawLine(500,100,650,100);
      g.drawLine(500,200,650,200);
      g.drawLine(650,100,500,160);
      g.drawLine(650,200,500,160);
   }
   
   public static void main(String args[]) {
      new PractGraf_8();
   }
}