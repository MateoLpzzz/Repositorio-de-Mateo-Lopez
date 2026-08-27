// Nombre y Apellido: Lopez Mateo
// Programacion IV
// UNLaR - Sede Chamical

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        // Modificación 1: cambio de título de la ventana
        JFrame ventana = new JFrame("Trabajo practico LSI");

        // Modificación 2: cambio de tamaño del JFrame
        ventana.setSize(400, 220);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel etiqueta = new JLabel("Nombre:");
        JTextField cajaTexto = new JTextField(15);
        JButton boton = new JButton("Saludar");

        // Modificación 4: JLabel nuevo con datos del estudiante
        JLabel etiquetaAlumno = new JLabel("Alumno: Lopez Mateo UNLaR Chamical");

        boton.addActionListener(e -> {
            String texto = cajaTexto.getText();
            JOptionPane.showMessageDialog(ventana, "Hola, " + texto + "!");
        });

        panel.add(etiqueta);
        panel.add(cajaTexto);
        panel.add(boton);
        panel.add(etiquetaAlumno);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}