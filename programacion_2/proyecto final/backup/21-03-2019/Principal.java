import javax.swing.*;
import java.awt.*;


public class Principal extends JFrame {
    
    public Principal(){
        
        
        
        JTabbedPane panelSolapas = new JTabbedPane();
        
        PanelCilindro panelCilindro = new PanelCilindro();
        //panelCilindro.add(new JLabel("Cilindro"));
        panelSolapas.addTab("Cilindro", null, panelCilindro, "Pulsar calcular la superficie y/o el volumen de un cilindro");
        
        
        PanelEsfera panelEsfera = new PanelEsfera();
        //panelEsfera.add(new JLabel("Esfera", null, JLabel.CENTER));
        panelSolapas.addTab("Esfera", null, panelEsfera, "Pulsar calcular la superficie y/o el volumen de una esfera");
        
        PanelPiramide panelPiramide = new PanelPiramide();
        //panelPiramide.add(new JLabel("Esfera", null, JLabel.CENTER));
        panelSolapas.addTab("Piramide", null, panelPiramide, "Pulsar calcular la superficie y/o el volumen de una pirámide");
        
        add(panelSolapas);
        setSize(350,400);
        setVisible(true);
        setTitle("Cálculo de superificie y volumen");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        
        //getContentPane().add(panelSolapas, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        
        
        
        
    
    }
    
    public static void main (String args[]){
        Principal a = new Principal();
    }
    
}
