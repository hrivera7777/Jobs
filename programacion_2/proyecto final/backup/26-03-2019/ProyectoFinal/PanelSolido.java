import javax.swing.*;
import java.text.*;
import java.awt.*;
public abstract class PanelSolido extends JPanel{
    protected JCheckBox bSuperficie;
    protected JCheckBox bVolumen;
    protected JTextArea resultado;
    protected DecimalFormat decformat;

    public PanelSolido(){
        decformat = new DecimalFormat("##########.###");
        JPanel mensaje = new JPanel();
        mensaje.setLayout(new BorderLayout());

        JLabel mensajeInicial = new JLabel ("Introduzca los datos requeridos para calcular la Superficie y/o el Volumen");
        mensaje.add(mensajeInicial,BorderLayout.NORTH);
        add(mensaje);

    }
    
    public abstract void escrituraArchivo();
}
