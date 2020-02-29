import javax.swing.*;
import java.awt.event.*;

public class VentanaSimple extends JFrame{
    
    JLabel etiqueta;
    JButton botonHola;
    JButton botonAdios;
    JPanel panel;
    
    
    public VentanaSimple(){
        etiqueta = new JLabel("Etiqueta inicial");
        botonHola = new JButton("Hola");
        botonAdios = new JButton ("Adiós");
        panel = new JPanel();
        
        panel.add(etiqueta);
        panel.add(botonHola);
        panel.add(botonAdios);
        add(panel);
        OyenteAccion oyenteBoton = new OyenteAccion();
        botonHola.addActionListener(oyenteBoton);
        botonAdios.addActionListener(oyenteBoton);
        
    }
    
    public static void main (String args []){
        VentanaSimple ventana = new VentanaSimple();
        ventana.setTitle("Ventana Swing");
        ventana.setSize(300,70);
        ventana.setVisible(true);
    }
    
    private class OyenteAccion implements ActionListener{
        public void actionPerformed (ActionEvent e){
            JButton boton = (JButton) e.getSource();
            etiqueta.setText("Boton pulsado" + boton.getText());
        }
    }   
    
}
