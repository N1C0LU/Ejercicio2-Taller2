/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Controlador.ControladorRectangulo;
import Modelo.Punto;
import javax.swing.JOptionPane;

/**
 * @author schar
 */
public class VistaRectangulo {

    public static void main(String[] args) {
        ControladorRectangulo controlador = new ControladorRectangulo();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    --- MENÚ RECTÁNGULO ---
                    1. Crear rectángulo
                    2. Calcular área
                    3. Cambiar escala (factor)
                    4. Cambiar escala (nueva coordenada)
                    5. Verificar punto dentro
                    6. Mover horizontalmente
                    7. Mover verticalmente
                    8. Ver rectángulo
                    9. Salir
                    """));

            switch (opcion) {
                case 1 -> {
                    double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x1:"));
                    double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y1:"));
                    double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x2:"));
                    double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y2:"));
                    controlador.crearRectangulo(x1, y1, x2, y2);
                    JOptionPane.showMessageDialog(null, "Rectángulo creado correctamente.");
                }
                case 2 -> JOptionPane.showMessageDialog(null, "Área: " + controlador.obtenerArea());
                case 3 -> {
                    double factor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese factor de escala:"));
                    controlador.cambiarEscala(factor);
                    JOptionPane.showMessageDialog(null, "Escala aplicada (factor).");
                }
                case 4 -> {
                    double nx2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nueva X2:"));
                    double ny2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nueva Y2:"));
                    controlador.cambiarEscala(nx2, ny2);
                    JOptionPane.showMessageDialog(null, "Escala aplicada (nueva coordenada).");
                }
                case 5 -> {
                    double px = Double.parseDouble(JOptionPane.showInputDialog("Ingrese X punto:"));
                    double py = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Y punto:"));
                    boolean dentro = controlador.contienePunto(px, py);
                    JOptionPane.showMessageDialog(null, dentro ? "El punto está dentro." : "El punto está fuera.");
                }
                case 6 -> {
                    double u = Double.parseDouble(JOptionPane.showInputDialog("Unidades (neg = izquierda):"));
                    controlador.moverHorizontal(u);
                    JOptionPane.showMessageDialog(null, "Movido horizontalmente.");
                }
                case 7 -> {
                    double u = Double.parseDouble(JOptionPane.showInputDialog("Unidades (neg = abajo):"));
                    controlador.moverVertical(u);
                    JOptionPane.showMessageDialog(null, "Movido verticalmente.");
                }
                case 8 -> {
                    if (controlador.getRectangulo() != null)
                        JOptionPane.showMessageDialog(null, controlador.getRectangulo().toString());
                    else
                        JOptionPane.showMessageDialog(null, "Primero cree un rectángulo.");
                }
                case 9 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente.");
            }
        } while (opcion != 9);
    }
}
