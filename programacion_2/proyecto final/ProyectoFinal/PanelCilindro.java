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
        JPanel panelDatosRadio = new JPanel();
        JPanel panelDatosAltura = new JPanel();
        JPanel panelChecks = new JPanel();
        JPanel panelBoton = new JPanel();
        JPanel panelTodosLosDatos = new JPanel();
        
        panelTodosLosDatos.setLayout(new GridLayout(3,1));

        JLabel radioC = new JLabel("Radio del Cilindro (en cms)");
        panelDatosRadio.add(radioC);
        campoRadioC = new JTextField (15);
        panelDatosRadio.add(campoRadioC);
        panelTodosLosDatos.add(panelDatosRadio);

        JLabel alturaC = new JLabel("Altura del Cilindro (en cms)");
        panelDatosAltura.add(alturaC);
        campoAlturaC = new JTextField (15);
        panelDatosAltura.add(campoAlturaC);
        panelTodosLosDatos.add(panelDatosAltura);

        bSuperficie = new JCheckBox ("Superficie", true);
        bVolumen = new JCheckBox ("Volumen", true);
        panelChecks.add(bSuperficie);
        panelChecks.add(bVolumen);
        panelTodosLosDatos.add(panelChecks);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setMnemonic('A');
        aceptar.addActionListener(new gestionaEvento());
        panelBoton.add(aceptar);
        
        add(panelTodosLosDatos,BorderLayout.NORTH);
        add(panelBoton,BorderLayout.CENTER);

        resultado = new JTextArea(3,35);
        add(resultado,BorderLayout.SOUTH);

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

            
            File archivo = new File (Principal.getRutaArchivo());
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter escritorBuf = new BufferedWriter(escritor);
            PrintWriter salidaConFormato = new PrintWriter(escritorBuf);

            salidaConFormato.println("Cilindro: ");
            salidaConFormato.println(datosCilindro);
            salidaConFormato.println(resulCilindro);

            salidaConFormato.close();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Debe guardar primero el archivo", "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }

}
