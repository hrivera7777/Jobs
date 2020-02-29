import javax.swing.*;
import java.awt.*;
public class Menus extends JFrame{
    public Menus(){
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuOpciones = new JMenu("Menú opciones");
        
        JMenuItem listar = new JMenuItem("Listar todos los alumnos ");
        menuOpciones.add(listar);
        menuOpciones.add(new JSeparator());
        
        JMenuItem listarTarde = new JMenuItem ("Ver alumnos de la tarde");
        menuOpciones.add(listarTarde);
        menuOpciones.add(new JSeparator());
         
        
        JMenuItem listarManana = new JMenuItem ("Ver alumnos de la tarde");
        menuOpciones.add(listarManana);
        menuOpciones.add(new JSeparator());
        
        
        JCheckBoxMenuItem verNumero = new JCheckBoxMenuItem ("Mostrar numero", true);
        
     // falta pag33
        
        
    }
}
