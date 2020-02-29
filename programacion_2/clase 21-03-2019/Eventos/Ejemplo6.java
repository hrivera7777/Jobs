import javax.swing.*;
import java.awt.event.*;

public class Ejemplo6 {
    public Ejemplo6(){
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
            });
            
            frame.setSize(400,100);
            frame.setVisible(true);
        }
 }