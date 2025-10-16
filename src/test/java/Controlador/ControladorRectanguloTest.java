/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Modelo.Punto;
import Modelo.Rectangulo;
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
public class ControladorRectanguloTest {

    private ControladorRectangulo controlador;

    @BeforeEach
    void setUp() {
        controlador = new ControladorRectangulo();
        controlador.crearRectangulo(0, 0, 4, 3);
    }

    @Test
    void testCrearRectangulo() {
        assertNotNull(controlador.getRectangulo());
        assertEquals(12, controlador.obtenerArea());
    }

    @Test
    void testMoverHorizontal() {
        controlador.moverHorizontal(2);
        Rectangulo r = controlador.getRectangulo();
        assertTrue(r.contienePunto(2, 1)); // ahora el rectángulo se desplazó a la derecha
    }

    @Test
    void testMoverVertical() {
        controlador.moverVertical(1);
        Rectangulo r = controlador.getRectangulo();
        assertTrue(r.contienePunto(2, 2)); // se movió hacia arriba
    }

    @Test
    void testCambiarEscalaFactor() {
        controlador.cambiarEscala(2);
        assertEquals(48, controlador.obtenerArea());
    }

    @Test
    void testCambiarEscalaCoordenadas() {
        controlador.cambiarEscala(8, 6);
        assertEquals(48, controlador.obtenerArea());
    }

    @Test
    void testContienePunto() {
        assertTrue(controlador.contienePunto(2, 2));
        assertFalse(controlador.contienePunto(10, 10));
    }

    @Test
    void testContienePuntoConObjeto() {
        Punto p = new Punto(1, 1);
        assertTrue(controlador.contienePunto(p));
    }

    @Test
    void testSinRectanguloDevuelveCero() {
        ControladorRectangulo nuevo = new ControladorRectangulo();
        assertEquals(0, nuevo.obtenerArea());
    }
}