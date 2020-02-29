
import javax.swing.*;
public class Ejemplo2{
    public Ejemplo2(){
        JFrame frame = new JFrame("Ejemplo");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JLabel panel = new JLabel ("Etiqueta");
        JButton button = new JButton("Botón");
        contentPane.add(panel);
        contentPane.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    
    }
    
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Ejemplo2 gui = new Ejemplo2();
            }
        });
    }
    
}
