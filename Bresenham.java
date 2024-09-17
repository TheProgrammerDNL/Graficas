package Graficas;

// Propiedad intelectual de ChatGPT 3.0

import java.util.ArrayList;
import java.util.List;

public class Bresenham {
    
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

    public static void main(String[] args) {
        List<int[]> puntos = bresenham(0, 0, 8, 6);
        
        for (int[] punto : puntos) {
            System.out.println("(" + punto[0] + ", " + punto[1] + ")");
        }
    }
}