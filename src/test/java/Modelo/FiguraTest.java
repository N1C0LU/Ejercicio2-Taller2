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
public class FiguraTest {

    private Figura figura;

    @BeforeEach
    void setUp() {
        figura = new Figura(0, 0, 4, 3);
    }

    @Test
    void testMoverHorizontal() {
        figura.moverHorizontal(2);
        assertEquals(2, figura.x1);
        assertEquals(6, figura.x2);
    }

    @Test
    void testMoverVertical() {
        figura.moverVertical(-1);
        assertEquals(-1, figura.y1);
        assertEquals(2, figura.y2);
    }

    @Test
    void testCambiarEscala() {
        figura.cambiarEscala(10, 20);
        assertEquals(10, figura.x2);
        assertEquals(20, figura.y2);
    }

    @Test
    void testCalcularAreaPorDefecto() {
        assertEquals(0, figura.calcularArea());
    }

    @Test
    void testContienePuntoPorDefecto() {
        assertFalse(figura.contienePunto(1, 1));
    }
}