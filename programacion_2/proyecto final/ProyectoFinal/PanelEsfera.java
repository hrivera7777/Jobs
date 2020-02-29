import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PanelEsfera extends PanelSolido{ 
    private Esfera esfera;
    private JTextField campoRadioE;

    public PanelEsfera(){
        super();
        JPanel panelDatos= new JPanel();
        JPanel panelChecks= new JPanel();
        JPanel panelBoton= new JPanel();
        JPanel panelDatosYChecks = new JPanel();
        panelDatosYChecks.setLayout(new GridLayout(2,1));

        JLabel radioE = new JLabel("Radio de la Esfera (en cms)");
        panelDatos.add(radioE);
        campoRadioE = new JTextField (15);
        panelDatos.add(campoRadioE);
        
        panelDatosYChecks.add(panelDatos);

        bSuperficie = new JCheckBox ("Superficie", true);
        bVolumen = new JCheckBox ("Volumen", true);
        panelChecks.add(bSuperficie);
        panelChecks.add(bVolumen);
        
        panelDatosYChecks.add(panelChecks);
        

        JButton aceptar = new JButton("Aceptar");
        aceptar.setMnemonic('A');
        panelBoton.add(aceptar);
        aceptar.addActionListener(new gestionaEvento());
        
        add(panelDatosYChecks,BorderLayout.NORTH);
        add(panelBoton,BorderLayout.CENTER);
        
        resultado = new JTextArea(3,35);
        add(resultado,BorderLayout.SOUTH);

    }
    
    private class gestionaEvento implements ActionListener{

        String textoIngresado;
        double radio;

        @Override
        public void actionPerformed(ActionEvent arg0) {

            textoIngresado = campoRadioE.getText();
            try{

                radio = Double.parseDouble(textoIngresado);

            }catch(NumberFormatException nfe){
                campoRadioE.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese un radio (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente","Error", JOptionPane.ERROR_MESSAGE);
            }
            esfera = new Esfera(radio);
            esfera.calcularSuperficie();
            esfera.calcularVolumen();
            escrituraArchivo();

            if(bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Superficie: "+ decformat.format(esfera.getSuperficie())+ " cms^2"  + "\nVolumen: "+ decformat.format(esfera.getVolumen())+ " cms^3");

            }else if(bSuperficie.isSelected() && !bVolumen.isSelected()){

                resultado.setText("Superficie: "+ decformat.format(esfera.getSuperficie())+ " cms^2");

            }else if(!bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Volumen: "+ decformat.format(esfera.getVolumen())+ " cms^3");

            }else{
                resultado.setText("Seleccione una opción");
            }

        }
    }

    public void escrituraArchivo(){
        String datosEsfera = "- Radio "+ decformat.format(esfera.getRadio());
        String resulEsfera = "- Superficie:  " + decformat.format(esfera.getSuperficie()) + " - Volumen: "+ decformat.format(esfera.getVolumen());
        try{
            
            
            
            File archivo = new File (Principal.getRutaArchivo());
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter escritorBuf = new BufferedWriter(escritor);
            PrintWriter salidaConFormato = new PrintWriter(escritorBuf);

            salidaConFormato.println("Esfera: ");
            salidaConFormato.println(datosEsfera);
            salidaConFormato.println(resulEsfera);

            salidaConFormato.close();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Debe guardar primero el archivo", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

}
