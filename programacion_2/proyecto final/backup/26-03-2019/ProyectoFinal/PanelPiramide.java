import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PanelPiramide extends PanelSolido{
    private Piramide piramide;
    private JTextField campoBaseP;
    private JTextField campoAlturaP;
    private JTextField campoApotemaP;

    public PanelPiramide(){ 
        super();
        
        JPanel panelDatosBase = new JPanel();
        JPanel panelDatosAltura = new JPanel();
        JPanel panelDatosApotema = new JPanel();
        JPanel panelChecks = new JPanel();
        JPanel panelBoton = new JPanel();
        JPanel panelTodosLosDatos = new JPanel();
        
        panelTodosLosDatos.setLayout(new GridLayout(4,1));

        JLabel baseP = new JLabel("Base de la pirámide (en cms)");
        panelDatosBase.add(baseP);
        campoBaseP = new JTextField (15);
        panelDatosBase.add(campoBaseP);
        
        panelTodosLosDatos.add(panelDatosBase);

        JLabel alturaP = new JLabel("Altura de la pirámide (en cms)");
        panelDatosAltura.add(alturaP);
        campoAlturaP = new JTextField (15);
        panelDatosAltura.add(campoAlturaP);
        
        panelTodosLosDatos.add(panelDatosAltura);

        JLabel apotemaP = new JLabel("Apotema de la pirámide (en cms)");
        panelDatosApotema.add(apotemaP);
        campoApotemaP = new JTextField (15);
        panelDatosApotema.add(campoApotemaP);
        
        panelTodosLosDatos.add(panelDatosApotema);

        bSuperficie = new JCheckBox ("Superficie", true);
        bVolumen = new JCheckBox ("Volumen", true);
        panelChecks.add(bSuperficie);
        panelChecks.add(bVolumen);
        
        panelTodosLosDatos.add(panelChecks);

        JButton aceptar = new JButton("Aceptar");
        panelBoton.add(aceptar);
        aceptar.setMnemonic('A');
        aceptar.addActionListener(new gestionaEvento());
        
        add(panelTodosLosDatos,BorderLayout.NORTH);
        add(panelBoton,BorderLayout.CENTER);

        resultado = new JTextArea(3,35);
        add(resultado,BorderLayout.SOUTH);
    }
    
    private class gestionaEvento implements ActionListener{
        
        private double base;
        private double altura;
        private double apotema;
        private String textoIngresado;

        @Override
        public void actionPerformed(ActionEvent arg0) {

            textoIngresado = campoBaseP.getText();

            try{
                base = Double.parseDouble(textoIngresado);

            }catch(NumberFormatException nfe){
                campoBaseP.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese una base (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }

            textoIngresado = campoAlturaP.getText();

            try{

                altura = Double.parseDouble(textoIngresado);

            }catch(NumberFormatException nfe){
                campoAlturaP.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese una altura (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }

            textoIngresado = campoApotemaP.getText();
            try{

                apotema = Double.parseDouble(textoIngresado);

            }catch(NumberFormatException nfe){
                campoApotemaP.setText("");
                JOptionPane.showMessageDialog(null, "Ingrese un apotema (número) correcto, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error inesperado, intenta nuevamente");
            }
            piramide = new Piramide(base, altura, apotema);
            piramide.calcularSuperficie();
            piramide.calcularVolumen();
            escrituraArchivo();

            if(bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Superficie: "+ decformat.format(piramide.getSuperficie()) + " cms^2" + "\nVolumen: "+ decformat.format(piramide.getVolumen())+ " cms^3");

            }else if(bSuperficie.isSelected() && !bVolumen.isSelected() ){

                resultado.setText("Superficie: "+ decformat.format(piramide.getSuperficie())+ " cms^2");

            }else if(!bSuperficie.isSelected() && bVolumen.isSelected()){

                resultado.setText("Volumen: "+ decformat.format(piramide.getVolumen())+ " cms^3");

            }else{
                resultado.setText("Seleccione una opción");
            }

        }
    }
    
    public void escrituraArchivo(){
        String datosPiramide = "- Base "+ decformat.format(piramide.getBase()) + " - Altura: "+ decformat.format(piramide.getAltura()) + " - Apotema: " + decformat.format(piramide.getApotema());
        String resulPiramide = "- Superficie:  " + decformat.format(piramide.getSuperficie()) + " - Volumen: "+ decformat.format(piramide.getVolumen());
        try{

            File archivo = new File ("Datos/datos.txt");//carpeta con un path relativo, se encuentra donde se ejecute el archivo principal
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter escritorBuf = new BufferedWriter(escritor);
            PrintWriter salidaConFormato = new PrintWriter(escritorBuf);

            salidaConFormato.println("Piramide: ");
            salidaConFormato.println(datosPiramide);
            salidaConFormato.println(resulPiramide);

            salidaConFormato.close();

        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);

        }
        
    }
    
    
}
