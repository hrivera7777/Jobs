import javax.swing.*;
public class Ejemplo{
    public Ejemplo(){
        JFrame frame = new JFrame("Ejemplo");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JLabel label = new JLabel ("Etiqueta");
        contentPane.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    
    }
    
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Ejemplo gui = new Ejemplo();
            }
        });
    }
    
}
