package Graficas;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
public class Generar_Mostrar_Imagen2 extends JFrame
{BufferedImage img;
public Generar_Mostrar_Imagen2()
{setBounds(0,0,800,600);
setVisible(true);
generarImagen();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void paint(Graphics g)
{ g.drawImage(img, 0,0,this);
}
public void generarImagen()
{int w=600;//ancho de la imagen
int h=400;//alto dela imagen
try{
img=new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
Graphics g=img.createGraphics();
//tambien puede ser Graphics2D
//Graphics2D g=img.createGraphics();
Pixel p=new Pixel();
g.setColor(Color.gray);//establecer el color del fondo de la imagen
g.fillRect(0,0,w,h);//pone el color de fondo de la imagen
//aqui vendrian sus dibujos, el ejemplo que pongo es para que se den una idea
g.setColor(Color.red);
g.drawRect(10,10,150,150);
g.setColor(Color.blue);
g.fillOval(30,30,120,120);
for (int i=300;i<500;i+=2)
{p.dibujarPixel(i,50,2,Color.pink,g);}
ImageIO.write(img,"jpg",new File("PractGraf_8.jpg"));// se graba la imagen en archivo
}
catch(IOException e)
{System.out.println(e.getMessage());}
}
public static void main(String arg[])
{new Generar_Mostrar_Imagen2();}
}