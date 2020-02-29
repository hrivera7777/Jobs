import javax.swing.*;
import java.awt.event.*;
public class VentanaSimple2 extends JFrame implements ActionListener {

    JLabel etiqueta;
    JButton botonHola;
    JButton botonAdios;
    JPanel panel;

    public VentanaSimple2(){
        etiqueta = new JLabel("Etiqueta inicial");
        botonHola = new JButton("Hola");
        botonAdios = new JButton ("Adiós");
        panel = new JPanel();

        panel.add(etiqueta);
        panel.add(botonHola);
        panel.add(botonAdios);
        add(panel);
        //OyenteAccion oyenteBoton = new OyenteAccion();
        botonHola.addActionListener(this);
        botonAdios.addActionListener(this);

    }

    public static void main (String args []){
        VentanaSimple ventana = new VentanaSimple();
        ventana.setTitle("Ventana Swing");
        ventana.setSize(300,70);
        ventana.setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
        JButton boton = (JButton) e.getSource();
        etiqueta.setText("Boton pulsado" + boton.getText());
    }

    
}
