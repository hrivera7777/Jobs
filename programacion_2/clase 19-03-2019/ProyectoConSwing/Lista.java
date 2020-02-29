import javax.swing.*;
import java.awt.*;

public class Lista extends JFrame{
    public Lista(){
        DefaultListModel modeloDatos = new DefaultListModel();
        for(int ind = 0 ; ind < 7; ind++){
            modeloDatos.addElement("Elemento" + ind);
            
        
        }
        
        JList lista = new JList(modeloDatos);
        lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lista.setLayoutOrientation(JList.VERTICAL_WRAP);
        JScrollPane panelDesplazamiento = new  JScrollPane(lista);
        add(panelDesplazamiento);
        setSize(100,200);
        setVisible(true);
    }
   
    // falta main pg 27
}
