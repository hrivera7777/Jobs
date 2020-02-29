import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;

public class PanelCilindro extends PanelSolido{
    private Cilindro cilindro;
    private JTextField campoRadioC;
    private JTextField campoAlturaC;

    public PanelCilindro(){
        super();

        JLabel radioC = new JLabel("Radio del Cilindro (en cms)");
        add(radioC);
        campoRadioC = new JTextField (15);
        add(campoRadioC);

        JLabel alturaC = new JLabel("Altura del Cilindro (en cms)");
        add(alturaC);
        campoAlturaC = new JTextField (15);
        add(campoAlturaC);

        bSuperficie = new JCheckBox ("Superficie", true);
        bVolumen = new JCheckBox ("Volumen", true);
        add(bSuperficie);
        add(bVolumen);

        JButton aceptar = new JButton("Aceptar");
        add(aceptar);
        aceptar.addActionListener(new gestionaEvento());

        resultado = new JTextArea(15,5);
        add(resultado);

    }
    private class gestionaEvento implements ActionListener{

        private String textoIngresado;
        private double radio;
        private double altura;

        @Override
        public void actionPerformed(ActionEvent arg0) {

            textoIngresado = campoRadioC.getText();

            try{

                radio = Double.parseDouble(textoIngresado);

            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Ingrese un radio (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }

            textoIngresado = campoAlturaC.getText();

            try{
                altura = Double.parseDouble(textoIngresado);

            }catch(NumberFormatException nfe){

                JOptionPane.showMessageDialog(null, "Ingrese una altura (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }

            cilindro = new Cilindro(radio, altura);
            cilindro.calcularSuperficie();
            cilindro.calcularVolumen();
            escrituraArchivo();

            if(bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Superficie: "+ decformat.format(cilindro.getSuperficie())+" cms^2" + "\nVolumen: "+ decformat.format(cilindro.getVolumen())+ " cms^3");

            }else if(bSuperficie.isSelected() && !bVolumen.isSelected() ){

                resultado.setText("Superficie: "+ decformat.format(cilindro.getSuperficie()) + " cms^2");

            }else if(!bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Volumen: "+ decformat.format(cilindro.getVolumen()) + " cms^3");

            }else{
                resultado.setText("Seleccione una opción");
            }

        }
    } 

    public void escrituraArchivo(){
        String datosCilindro = "- Radio "+ decformat.format(cilindro.getRadio()) + " - Altura: "+ decformat.format(cilindro.getAltura());
        String resulCilindro = "- Superficie:  " + decformat.format(cilindro.getSuperficie()) + " - Volumen: "+ decformat.format(cilindro.getVolumen());
        try{

            File archivo = new File ("Datos/datos.txt");
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter escritorBuf = new BufferedWriter(escritor);
            PrintWriter salidaConFormato = new PrintWriter(escritorBuf);

            salidaConFormato.println("Cilindro: ");
            salidaConFormato.println(datosCilindro);
            salidaConFormato.println(resulCilindro);

            salidaConFormato.close();

        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }

}
