import javax.swing.*;
public class HelloWordSwing{
    
    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("HelloWoldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel ("Hello World");
       // frame.getContentPane().add(label);
        frame.add(label);
       frame.pack();
        frame.setVisible(true);
        
    
    }
    
    public static void main(String [] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable (){
            public void run(){createAndShowGUI();}
        } );
        
    }
    
    
}
