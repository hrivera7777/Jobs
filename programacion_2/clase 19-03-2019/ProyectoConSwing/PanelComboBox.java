import javax.swing.*;
import java.awt.*;
public class PanelComboBox extends JFrame{
    
    String [] listaElementos = new String [15];
    
    public PanelComboBox(){
        setLayout(new FlowLayout());
        setTitle("Prueba de JTextFiel y JTextArea");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int ind =0; ind <listaElementos.length; ind++){
        
            listaElementos[ind] = new String ("Elemento " + ind);
            
        }
        JComboBox combo1 = new JComboBox(listaElementos);
        JComboBox combo2 = new JComboBox(listaElementos);
        
        combo2.setEditable(true);
        combo2.setSelectedItem("OTRO");
        combo2.setMaximumRowCount(5);
        add(combo1);
        add(combo2);
        setSize(350,200);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        PanelComboBox ven = new PanelComboBox();
    }
    
}
