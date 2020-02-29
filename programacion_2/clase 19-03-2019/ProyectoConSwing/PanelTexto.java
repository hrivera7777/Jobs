import javax.swing.*;
import java.awt.*;
public class PanelTexto extends JFrame{
    
    final String FIN = "\n";
    
    public PanelTexto(){
    
        setLayout(new FlowLayout());
        setTitle("Prueba de JTextField y JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField campoTexto = new JTextField ("Campo texto");
        add(campoTexto, BorderLayout.NORTH);
        String texto = FIN + "Area texto " + FIN + "Varias lineas";
        JTextArea areaTexto = new JTextArea(texto);
       
        add (areaTexto, BorderLayout.CENTER);
        setVisible(true);
        setSize(100,200);
        
    }
    
    public static void main (String args[]){
        PanelTexto ventana = new PanelTexto();
    }
  
}
