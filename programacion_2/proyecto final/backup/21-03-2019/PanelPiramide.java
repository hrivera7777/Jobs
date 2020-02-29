import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelPiramide extends JPanel{

    JTextField campoBaseP;
    JTextField campoAlturaP;
    JTextField campoApotemaP;

    JCheckBox bSuperficie;
    JCheckBox bVolumen;
    JTextArea resultado;


    public PanelPiramide(){
        setVisible(true);
        JLabel mensajeInicial = new JLabel ("Introduzca los datos requeridos para calcular la Superficie y/o el volumen de un pirámide");
        add(mensajeInicial);

        JLabel baseP = new JLabel("Base de la pirámide (en cms)");
        add(baseP);
        campoBaseP = new JTextField (15);
        add(campoBaseP);

        JLabel alturaP = new JLabel("Altura de la pirámide (en cms)");
        add(alturaP);
        campoAlturaP = new JTextField (15);
        add(campoAlturaP);

        JLabel apotemaP = new JLabel("Apotema de la pirámide (en cms)");
        add(apotemaP);
        campoApotemaP = new JTextField (15);
        add(campoApotemaP);

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
        private Piramide piramide;
        private double base;
        private double altura;
        private double apotema;
        private String textoIngresado;

        @Override
        public void actionPerformed(ActionEvent arg0) {

            textoIngresado = campoBaseP.getText();

            try{
                base = Integer.parseInt(textoIngresado);

            }catch(NumberFormatException nfe){
                campoBaseP.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese una base (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }

            textoIngresado = campoAlturaP.getText();

            try{

                altura = Integer.parseInt(textoIngresado);

            }catch(NumberFormatException nfe){
                campoAlturaP.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese una altura (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }

            textoIngresado = campoApotemaP.getText();
            try{

                apotema = Integer.parseInt(textoIngresado);

            }catch(NumberFormatException nfe){
                campoApotemaP.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese un apotema (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }
            piramide = new Piramide(base, altura, apotema);

            if(bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Superficie: "+piramide.calcularSuperficie()  + "\nVolumen: "+ piramide.calcularVolumen());
                
            }else if(bSuperficie.isSelected() && !bVolumen.isSelected() ){
                resultado.setText("Superficie: "+ piramide.calcularSuperficie());

            }else if(!bSuperficie.isSelected() && bVolumen.isSelected()){
                resultado.setText("Volumen: "+ piramide.calcularVolumen());
            }else{
                resultado.setText("Seleccione una opción");
            }

        }
    }

}
