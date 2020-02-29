import javax.swing.*;
import java.awt.*;
public class EjemploBoton extends JFrame{
    
    EjemploBoton(){
        ImageIcon icono = new ImageIcon("cross.gif");
        
        JButton boton = new JButton ("Cancelar", icono);
        String cadHTML = "<html> Botón con <p> texto <i> html</i>";
        JButton botonHTML = new JButton(cadHTML);
        setTitle("Mi programa");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        getContentPane().add(boton, BorderLayout.WEST);
        getContentPane().add(botonHTML,BorderLayout.EAST);
        pack();
        setSize(400,100);
        setVisible(true);
        
    }
    
    public static void main (String args []){
        EjemploBoton  a= new EjemploBoton();
    }
    
}
