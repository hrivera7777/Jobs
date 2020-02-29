import javax.swing.*;
import java.awt.*;
public class EjemploJTabbedPane extends JFrame{
    EjemploJTabbedPane(){
        JTabbedPane panelSolapas = new JTabbedPane();
        JPanel panel1 = new JPanel();
        
        panel1.add(new JLabel("panel1"));
        
        panelSolapas.addTab("Primero", null, panel1, "Pulsar para primer panel");
        
        JPanel panel2 = new JPanel();
        
        panel2.add(new JLabel("Panel2", null, JLabel.CENTER));
        
        panelSolapas.addTab("segundo", null, panel2, "Pulsar para segundo panel");
        
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        getContentPane().add(panelSolapas, BorderLayout.CENTER);
        
        pack();
        setSize(400,200);
        setVisible(true);
        
        
    }
    
    public static void main (String args[]){
        EjemploJTabbedPane a = new EjemploJTabbedPane();
    }
}
