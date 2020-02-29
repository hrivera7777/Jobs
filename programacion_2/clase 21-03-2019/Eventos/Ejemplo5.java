import javax.swing.*;
import java.awt.event.*;

public class Ejemplo5{
    public Ejemplo5(){
        JFrame frame = new JFrame("Ejemplo");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowListener() {
            public void windowClosing(WindowEvent e){
                JFrame frame = (JFrame) e.getSource();
                int confirm = JOptionPane.showOptionDialog(frame,"¿seguro que quiere salir?",
                "Cuadro confirmación", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
                
                if (confirm == JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                    
                }
                
                
               
            }
            public void windowOpened(WindowEvent e){
                    //acabar pag11
                }
        });
    }
}
