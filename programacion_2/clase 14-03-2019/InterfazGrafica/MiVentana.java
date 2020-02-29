import javax.swing.*;
public class MiVentana extends JFrame{
    public MiVentana(String titulo, int x, int y){
            this.setSize(x, y);
            this.setTitle(titulo);
            this.setVisible(true);
        
   }
        public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                MiVentana ventana1 = new MiVentana("Titulo 1", 200, 400);
                MiVentana ventana2 = new MiVentana("Titulo 2", 200, 400);
                JPanel contenidoPanel1 = (JPanel) ventana1.getContentPane();
                contenidoPanel1.add(new JRadioButton("a"));
                JPanel contenidoPanel2 = (JPanel) ventana2.getContentPane();
                contenidoPanel2.add(new JCheckBox("a"));
            }
        });
    }
        
    
}
