import javax.swing.*;
import java.awt.*;

public class MarcoGestores extends JFrame{
    public MarcoGestores (){
        JPanel pa1 = new JPanel (new FlowLayout());
       JPanel pa2 = new JPanel (new BorderLayout());
        JPanel pa3 = new JPanel ();
        
        String [] opc = {"Marea alta", "Bajamar", "Montaña"};
        pa1.add(new JLabel ("Elegir", JLabel.CENTER));
       pa1.add(new JList(opc));
       pa1.add(new JButton ("Pulsar"));
       JTextField j = new JTextField("Razones");
       j.setEditable(false);
       pa2.add(j, BorderLayout.WEST);
       pa2.add(new JButton ("Botón"), BorderLayout.EAST);
       
       pa3.add(new JCheckBox ("Box", false));
       pa3.add(new JLabel("Calendario", JLabel.CENTER));
       pa3.add(new JRadioButton("Bot radio", true));
       
       setLayout(new BorderLayout(10,15));
       add(pa1, BorderLayout.NORTH);
       add(pa2, BorderLayout.CENTER);
       add(pa3, BorderLayout.SOUTH);
        
    }
    
    
    // falta el main pag 18  https://campus.virtual.unal.edu.co/pluginfile.php/1253523/mod_resource/content/1/Interfaz%20gráfica%20de%20usuario%20II.pdf
    
}
