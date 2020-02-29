import javax.swing.*;
import java.text.*;

public abstract class PanelSolido extends JPanel{
    protected JCheckBox bSuperficie;
    protected JCheckBox bVolumen;
    protected JTextArea resultado;
    protected DecimalFormat decformat;

    public PanelSolido(){
        decformat = new DecimalFormat("##########.###");
        setVisible(true);

        JLabel mensajeInicial = new JLabel ("Introduzca los datos requeridos para calcular la Superficie y/o el Volumen");
        add(mensajeInicial);

    }
    
    public abstract void escrituraArchivo();
}
