/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author schar
 */
public class RectanguloTest {

    private Rectangulo rectangulo;

    @BeforeEach
    void setUp() {
        rectangulo = new Rectangulo(0, 0, 4, 3);
    }

    @Test
    void testCalcularArea() {
        assertEquals(12, rectangulo.calcularArea());
    }

    @Test
    void testContienePuntoDentro() {
        assertTrue(rectangulo.contienePunto(2, 2));
    }

    @Test
    void testContienePuntoFuera() {
        assertFalse(rectangulo.contienePunto(5, 5));
    }

    @Test
    void testContienePuntoConObjetoPunto() {
        Punto p = new Punto(1, 1);
        assertTrue(rectangulo.contienePunto(p));
    }

    @Test
    void testCambiarEscalaFactor() {
        rectangulo.cambiarEscala(2);
        assertEquals(8, rectangulo.x2);
        assertEquals(6, rectangulo.y2);
    }

    @Test
    void testToString() {
        String texto = rectangulo.toString();
        assertTrue(texto.contains("Rectángulo"));
        assertTrue(texto.contains("Area=12"));
    }
}
