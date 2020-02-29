import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PanelEsfera extends PanelSolido{ 
    private Esfera esfera;
    private JTextField campoRadioE;

    public PanelEsfera(){
        super();

        JLabel radioE = new JLabel("Radio de la Esfera (en cms)");
        add(radioE);
        campoRadioE = new JTextField (15);
        add(campoRadioE);

        bSuperficie = new JCheckBox ("Superficie", true);
        bVolumen = new JCheckBox ("Volumen", true);
        add(bSuperficie);
        add(bVolumen);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setMnemonic('A');
        add(aceptar);
        aceptar.addActionListener(new gestionaEvento());

        resultado = new JTextArea(15,5);
        add(resultado);

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

            File archivo = new File ("Datos/datos.txt");
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter escritorBuf = new BufferedWriter(escritor);
            PrintWriter salidaConFormato = new PrintWriter(escritorBuf);

            salidaConFormato.println("Esfera: ");
            salidaConFormato.println(datosEsfera);
            salidaConFormato.println(resulEsfera);

            salidaConFormato.close();

        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }
   
}
