
import javax.swing.*;
import java.awt.*;
public class Ejercicio3 {
    public Ejercicio3(){
       JFrame frame = new JFrame("MiSegundoLayout");
       JPanel contenidoPanel = (JPanel) frame.getContentPane();
       JPanel panel = new JPanel();
       JPanel panel2 = new JPanel();
       panel.setLayout(new BorderLayout());
       panel2.setLayout(new GridLayout(2,2));
       panel2.add(new JButton("Boton 0"));
       panel2.add(new JButton("Boton 1"));
       panel2.add(new JButton("Boton 2"));
       panel2.add(new JButton("Boton 3"));
       panel.add(new JButton("Boton 5"),BorderLayout.NORTH);
       panel.add(new JButton("Boton 8"),BorderLayout.EAST);
       panel.add(new JButton("Boton 7"),BorderLayout.SOUTH);
       panel.add(new JButton("Boton 6"),BorderLayout.WEST);
       panel.add(panel2,BorderLayout.CENTER);
       contenidoPanel.add(panel);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,200);
       frame.setVisible(true);
    }
    
    public static void main(String [] args){
       javax.swing.SwingUtilities.invokeLater(new Runnable(){
           public void run() {
            Ejercicio3 gui = new Ejercicio3();
            }
        });
    }
}

