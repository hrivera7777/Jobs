import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class PanelCilindro extends JPanel{

    JTextField campoRadioC;
    JTextField campoAlturaC;
    JCheckBox bSuperficie;
    JCheckBox bVolumen;
    JTextArea resultado;
    DecimalFormat decformat;
    
    public PanelCilindro(){
        decformat = new DecimalFormat("##########.###");
        setVisible(true);

        JLabel mensajeInicial = new JLabel ("Introduzca los datos requeridos para calcular la Superficie y/o el volumen de un cilindro");
        add(mensajeInicial);

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
        private Cilindro cilindro;
        private String textoIngresado;
        private double radio;
        private double altura;
        
        @Override
        public void actionPerformed(ActionEvent arg0) {

            textoIngresado = campoRadioC.getText();

            try{
                radio = Integer.parseInt(textoIngresado);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Ingrese un radio (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }

            textoIngresado = campoAlturaC.getText();

            try{
                altura = Integer.parseInt(textoIngresado);

            }catch(NumberFormatException nfe){

                JOptionPane.showMessageDialog(null, "Ingrese una altura (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            cilindro = new Cilindro(radio, altura);
            
            if(bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Superficie: "+ decformat.format(cilindro.calcularSuperficie()) + "\nVolumen: "+ decformat.format(cilindro.calcularVolumen()));
                
            }else if(bSuperficie.isSelected() && !bVolumen.isSelected() ){
                resultado.setText("Superficie: "+ decformat.format(cilindro.calcularSuperficie()));

            }else if(!bSuperficie.isSelected() && bVolumen.isSelected()){
                resultado.setText("Volumen: "+ decformat.format(cilindro.calcularVolumen()));
            }else{
                resultado.setText("Seleccione una opción");
            }
            

        }
    }   
    
}
