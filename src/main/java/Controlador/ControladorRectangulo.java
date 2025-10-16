/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controlador;

import Modelo.Rectangulo;
import Modelo.Punto;

/**
 *
 * @author schar
 */
public class ControladorRectangulo {
    private Rectangulo rectangulo;

    public void crearRectangulo(double x1, double y1, double x2, double y2) {
        rectangulo = new Rectangulo(x1, y1, x2, y2);
    }

    public double obtenerArea() {
        return rectangulo != null ? rectangulo.calcularArea() : 0;
    }

    public void moverHorizontal(double unidades) { if (rectangulo != null) rectangulo.moverHorizontal(unidades); }
    public void moverVertical(double unidades) { if (rectangulo != null) rectangulo.moverVertical(unidades); }

    public void cambiarEscala(double factor) { if (rectangulo != null) rectangulo.cambiarEscala(factor); }
    public void cambiarEscala(double nuevaX2, double nuevaY2) { if (rectangulo != null) rectangulo.cambiarEscala(nuevaX2, nuevaY2); }

    public boolean contienePunto(double px, double py) { return rectangulo != null && rectangulo.contienePunto(px, py); }
    public boolean contienePunto(Punto p) { return rectangulo != null && rectangulo.contienePunto(p); }

    public Rectangulo getRectangulo() { return rectangulo; }
}
