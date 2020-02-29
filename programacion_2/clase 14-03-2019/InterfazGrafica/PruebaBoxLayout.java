import javax.swing.*;
import java.awt.*;
public class PruebaBoxLayout extends JFrame{
    public PruebaBoxLayout (){
        setTitle("Prueba BoxLayout4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setSize(400,200);
        
        
        
        JButton b1,b2, b3, b4, b5;
        b1= new JButton("Boton1");
        b2= new JButton("Boton2");
        b3= new JButton("Boton3");
        b4= new JButton("Boton4");
        b5= new JButton("Boton5");
        
        
        add(b1);
        add(Box.createGlue());
        
        add(b2);
        add(Box.createGlue());
        
        add(b3);
        add(Box.createGlue());
        
        add(b4);
        add(Box.createGlue());
        
        add(b5);
        add(Box.createGlue());
        pack();
        setVisible(true);
       
        
    }
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                PruebaBoxLayout gui = new PruebaBoxLayout();
            }
        });
    }
}
