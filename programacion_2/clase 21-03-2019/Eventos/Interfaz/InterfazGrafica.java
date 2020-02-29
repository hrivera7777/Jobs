package Interfaz;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class InterfazGrafica extends JFrame{
    
    private Aplicacion aplicacion;
    private JButton aniadir;
    private JButton visualizar;
    private DefaultListModel modeloLista;
    
    
    public InterfazGrafica (Aplicacion aplicacion){
        this.aplicacion = aplicacion;
        OyenteVisualizar oyenteVisualizar = new OyenteVisualizar();
        OyenteHorario oyenteHorario = new OyenteHorario();
        JPanel panel = new JPanel();
        modeloLista = new DefaultListModel();
        JList lista = new JList (modeloLista);
        panel.add(new JScrollPane(lista));
        aniadir = new JButton("añadir");
        aniadir.setMnemonic('A');
        aniadir.addActionListener(new OyenteNuevo());
        visualizar.setMnemonic('V');
        visualizar.addActionListener(oyenteVisualizar);
        panel.add(aniadir);
        panel.add(visualizar);
        getContentPane().add(panel);
        
        //menu
        
        JMenuBar barraMenu = new JMenuBar ();
        JMenu menuOpciones = new JMenu("Menú de opciones");
        JMenuItem listar = new JMenuItem("Listar todos los alumnos");
        listar.addActionListener(oyenteVisualizar);
        menuOpciones.add(listar);
        
        //separador
        
        menuOpciones.add(new JSeparator());
        JMenuItem listarTarde = new JMenuItem("Ver alumnos de la tarde");
        listarTarde.setActionCommand("Tarde");
        listarTarde.addActionListener(oyenteHorario);
        menuOpciones.add(listarTarde);
        JMenuItem listarManiana = new JMenuItem("Ver alumnos  de la mañan");
        listarManiana.setActionCommand("Mañana");
        listarManiana.addActionListener(oyenteHorario);
        menuOpciones.add(listarManiana);
        barraMenu.add(menuOpciones);
        
        // establecer como barra de menús en contenedor de alto nivel
        setJMenuBar(barraMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gestion de alumnos");
        setSize(300,250);
        setVisible(true);
        
        
    }
    private class OyenteNuevo implements ActionListener{
    
        public void actionPerformed(ActionEvent evento){
        
            boolean error = false;
            
            PanelDatosAlumno panel = new PanelDatosAlumno();
            
            if(JOptionPane.showConfirmDialog(null,panel, "Introduzca datos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)== JOptionPane.OK_OPTION){
                String nombre = panel.CampoNombre.getText();
                int anio=0;
                
                try{
                    anio = Integer.parseInt(panel.CampoAnio.getText())
                }
                catch(Exception e){
                    
                    error = true;
                
                }
                //pag22
                
            }
        }
    }
    
}
