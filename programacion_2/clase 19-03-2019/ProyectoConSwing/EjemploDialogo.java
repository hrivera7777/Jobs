import javax.swing.*;
import java.awt.event.*;
public class EjemploDialogo extends JFrame{
   
    public static void main (String [] args){
        EjemploDialogo ventana = new EjemploDialogo();
        JOptionPane.showMessageDialog(ventana,"Debe introducir en todos los campos", 
        "Error de entrada de datos", JOptionPane.ERROR_MESSAGE);
    
        Object[] textoOpciones = {
            "Si adelante", "Ahora no", "No se que hacer"
        };
        
        int opcion = JOptionPane.showOptionDialog(ventana,"¿Desea realizar la operación ahora?", "Mensaje de confimación",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, textoOpciones,textoOpciones[0]);
        
    }
 
}
