import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelEsfera extends JPanel{ 

    JTextField campoRadioE;
    JCheckBox bSuperficie;
    JCheckBox bVolumen;
    JTextArea resultado;

    public PanelEsfera(){
        setVisible(true);

        JLabel mensajeInicial = new JLabel ("Introduzca el dato requerido para calcular la Superficie y/o el volumen de una esfera");
        add(mensajeInicial);
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
        private Esfera esfera;
        String textoIngresado;
        double radio;

        @Override
        public void actionPerformed(ActionEvent arg0) {

            textoIngresado = campoRadioE.getText();
            try{

                radio = Integer.parseInt(textoIngresado);

            }catch(NumberFormatException nfe){
                campoRadioE.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese un radio (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente","Error", JOptionPane.ERROR_MESSAGE);
            }
            esfera = new Esfera(radio);
            
            
            if(bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Superficie: "+ esfera.calcularSuperficie()  + "\nVolumen: "+ esfera.calcularVolumen());
                
            }else if(bSuperficie.isSelected() && !bVolumen.isSelected() ){
                resultado.setText("Superficie: "+ esfera.calcularSuperficie());

            }else if(!bSuperficie.isSelected() && bVolumen.isSelected()){
                resultado.setText("Volumen: "+ esfera.calcularVolumen());
            }else{
                resultado.setText("Seleccione una opción");
            }
            
            
        }

    }  
}
