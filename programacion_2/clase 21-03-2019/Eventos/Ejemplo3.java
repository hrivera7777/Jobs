import javax.swing.*;
import java.awt.event.*;

public class Ejemplo3{
        public Ejemplo3(){
            JFrame frame = new JFrame ("Ejemplo");
            JPanel contetPane = (JPanel) frame.getContentPane();
            JPanel panel = new JPanel();
            JButton boton = new JButton("Haz click aquí");
            boton.addActionListener(new ActionListener(){
               public void actionPerformed (ActionEvent e){
                   System.out.println("Botón pulsado");
                   JButton clickedButton = (JButton) e.getSource();
                   clickedButton.setEnabled(false);
                } 
            });
          
            panel.add(boton);
            
            contetPane.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,100);
            frame.setVisible(true);
            
        }
        
        public static void main (String args[]){
            javax.swing.SwingUtilities.invokeLater(new Runnable(){
                public void run (){
                    Ejemplo3 gui= new Ejemplo3();
                }
            });
        }
        
        
}
