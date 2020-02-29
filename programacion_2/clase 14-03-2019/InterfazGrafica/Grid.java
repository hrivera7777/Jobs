import javax.swing.*;
import java.awt.*;
public class Grid
{
    public Grid (){
        JFrame frame = new JFrame ("FlowLayout");
        JPanel contenidoPanel = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel ();
        panel.setLayout(new GridLayout (3,2));
        panel.add(new JButton("Boton 1"));
        panel.add(new JButton("Boton 2"));
        panel.add(new JButton("Boton 3"));
        panel.add(new JButton("Boton 4"));
        panel.add(new JButton("Boton 5"));
        panel.add(new JButton("Boton 6"));
        contenidoPanel.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
        
    }
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Grid gui = new Grid();
            }
        });
    }
}
