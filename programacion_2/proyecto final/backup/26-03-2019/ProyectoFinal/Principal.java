import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Principal extends JFrame {
    PanelCilindro panelCilindro;
    PanelEsfera panelEsfera;
    PanelPiramide panelPiramide;

    public Principal(){

        JTabbedPane panelSolapas = new JTabbedPane();

        panelCilindro = new PanelCilindro();
        panelSolapas.addTab("Cilindro", null, panelCilindro, "Pulsar calcular la superficie y/o el volumen de un cilindro");

        panelEsfera = new PanelEsfera();
        panelSolapas.addTab("Esfera", null, panelEsfera, "Pulsar calcular la superficie y/o el volumen de una esfera");

        panelPiramide = new PanelPiramide();
        panelSolapas.addTab("Piramide", null, panelPiramide, "Pulsar calcular la superficie y/o el volumen de una pirámide");

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

}
