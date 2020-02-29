import javax.swing.*;
import java.awt.*;
public class Border
{
   
    public Border (){
        JFrame frame = new JFrame ("BorderLayout");
        JPanel contenidoPanel = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel ();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton("Boton 1"),BorderLayout.NORTH);
        panel.add(new JButton("Boton 2"),BorderLayout.EAST);
        panel.add(new JButton("Boton 3"), BorderLayout.SOUTH);
        panel.add(new JButton("Boton 4"), BorderLayout.WEST);
        panel.add(new JButton("Boton 5"), BorderLayout.CENTER);
       
        contenidoPanel.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
        
    }
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Border gui = new Border();
            }
        });
    }
}
