import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Principal extends JFrame {
    PanelCilindro panelCilindro;
    PanelEsfera panelEsfera;
    PanelPiramide panelPiramide;
    private static String rutaArchivo;

    public Principal(){
        
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuGuardar = new JMenu ("Menu");
        JMenuItem guardar = new JMenuItem("Guardar");
        
        guardar.addActionListener(new gestionaEvento());
        barraMenu.add(menuGuardar);
        menuGuardar.add(guardar);
      
        
        JTabbedPane panelSolapas = new JTabbedPane();

        panelCilindro = new PanelCilindro();
        panelSolapas.addTab("Cilindro", null, panelCilindro, "Pulsar calcular la superficie y/o el volumen de un cilindro");

        panelEsfera = new PanelEsfera();
        panelSolapas.addTab("Esfera", null, panelEsfera, "Pulsar calcular la superficie y/o el volumen de una esfera");

        panelPiramide = new PanelPiramide();
        panelSolapas.addTab("Piramide", null, panelPiramide, "Pulsar calcular la superficie y/o el volumen de una pirámide");
        
        setJMenuBar(barraMenu);
        
        add(panelSolapas);
        setSize(430,330);
        setVisible(true);
        setResizable(false);
        setTitle("Cálculo de superificie y volumen");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

    }

    public static void main (String args[]){
        Principal ventana = new Principal();
    }
    
    private class gestionaEvento implements ActionListener{

        private String textoIngresado;
        private double radio;
        private double altura;

        @Override
        public void actionPerformed(ActionEvent arg0) {
            
            
            
           rutaArchivo = "";
           
           JFileChooser  guardarComo = new JFileChooser();
            
            guardarComo.setApproveButtonText("Guardar");
            guardarComo.showSaveDialog(null);
            
            File archivo = new File (guardarComo.getSelectedFile()+ ".txt");
            
            rutaArchivo = archivo.getAbsolutePath();
           

        }
    } 
    
    public static String getRutaArchivo (){
        return rutaArchivo;
    }
    
}
