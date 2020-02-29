import javax.swing.*;
import java.awt.*;
public class EjemploScrollPane extends JFrame{
    
    public EjemploScrollPane(){
        JSplitPane panelDividido;
        JScrollPane panelIzquierdo = new JScrollPane();
        panelIzquierdo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        JScrollPane panelDerecho = new JScrollPane();
        
        panelDerecho.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelDividido = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelDerecho, panelIzquierdo);
        
        panelDividido.setDividerLocation(200);
        
        setTitle("Mi programa");
        //pag 38 terminar
        
        
        
    }
}
