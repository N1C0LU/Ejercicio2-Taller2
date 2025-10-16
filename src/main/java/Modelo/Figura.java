/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

/**
 *
 * @author schar
 */
public class Figura {
    protected double x1, y1, x2, y2;

    public Figura(double x1, double y1, double x2, double y2) {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
    }

    public double calcularArea() {
        return 0; // será sobrescrito
    }

    public void moverHorizontal(double unidades) {
        x1 += unidades; x2 += unidades;
    }

    public void moverVertical(double unidades) {
        y1 += unidades; y2 += unidades;
    }

    public void cambiarEscala(double nuevaX2, double nuevaY2) {
        x2 = nuevaX2; y2 = nuevaY2;
    }

    public boolean contienePunto(double px, double py) {
        return false; // será sobrescrito
    }
}