/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

/**
 *
 * @author schar
 */
public class Rectangulo extends Figura {

    public Rectangulo(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public double calcularArea() {
        double base = Math.abs(x2 - x1);
        double altura = Math.abs(y2 - y1);
        return base * altura;
    }

    @Override
    public boolean contienePunto(double px, double py) {
        double minX = Math.min(x1, x2), maxX = Math.max(x1, x2);
        double minY = Math.min(y1, y2), maxY = Math.max(y1, y2);
        return px >= minX && px <= maxX && py >= minY && py <= maxY;
    }

    public boolean contienePunto(Punto p) {
        return contienePunto(p.getX(), p.getY());
    }

    public void cambiarEscala(double factor) {
        x2 = x1 + (x2 - x1) * factor;
        y2 = y1 + (y2 - y1) * factor;
    }

    @Override
    public String toString() {
        return "Rectángulo [(" + x1 + ", " + y1 + ") - (" + x2 + ", " + y2 + ")] Area=" + calcularArea();
    }
}