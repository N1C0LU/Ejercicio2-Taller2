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
public class PuntoTest {

    private Punto punto;

    @BeforeEach
    void setUp() {
        punto = new Punto(3.5, 2.0);
    }

    @Test
    void testGetters() {
        assertEquals(3.5, punto.getX());
        assertEquals(2.0, punto.getY());
    }

    @Test
    void testSetters() {
        punto.setX(10);
        punto.setY(20);
        assertEquals(10, punto.getX());
        assertEquals(20, punto.getY());
    }

    @Test
    void testToString() {
        assertEquals("(3.5, 2.0)", punto.toString());
    }
}
