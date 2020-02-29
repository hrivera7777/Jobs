import javax.swing.*;
import java.awt.*;
public class PanelBotones extends JFrame{
    
    public PanelBotones(){
        setLayout(new FlowLayout());
        setTitle("Prueba de Botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToggleButton boton1 = new JToggleButton("No seleccionado");
        JToggleButton boton2 =  new JToggleButton("Seleccionado", true);
        
        add(boton1);
        add(boton2);
        
        JCheckBox casilla1 = new JCheckBox ("NO Seleccionada");
        JCheckBox casilla2 = new JCheckBox ("Seleccionada", true);
        
        add(casilla1);
        add(casilla2);
        
        ButtonGroup grupo = new ButtonGroup();
        JRadioButton opcion1 = new JRadioButton("si", true);
        JRadioButton opcion2 = new JRadioButton("no");
        JRadioButton opcion3 = new JRadioButton("no sabe");
        
        grupo.add(opcion1);
        
        // pagina  23 
        
    }
   
}
