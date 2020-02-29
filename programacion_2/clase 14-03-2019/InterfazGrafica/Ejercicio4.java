import javax.swing.*;
import java.awt.*;
public class Ejercicio4
{
    public Ejercicio4 (){
        JFrame frame = new JFrame ("Ejercicio 4");
        JPanel contenidoPanel = (JPanel) frame.getContentPane();
        JPanel panelS = new JPanel ();
        panelS.setLayout(new BorderLayout());
        
        
        JPanel nombre = new JPanel();
        nombre.add(new JLabel("Nombre"));
        nombre.add(new JTextField(15));
        
        JPanel apellidos = new JPanel();
        apellidos.add(new JLabel("Apellidos"));
        apellidos.add(new JTextField(15));
        
        
        JPanel password = new JPanel();
        password.add(new JLabel("Password"));
        password.add(new JPasswordField(15));
        
        panelS.add(nombre,BorderLayout.NORTH);
        panelS.add(apellidos, BorderLayout.CENTER);
        panelS.add(password, BorderLayout.SOUTH);
        
        
        JPanel genero = new JPanel();
        genero.add(new JLabel("Genero"));
        genero.add(new JRadioButton("H"));
        genero.add(new JRadioButton("M"));
        
        JPanel deacuerdo = new JPanel();
        deacuerdo.add(new JLabel("¿Estás de acuerdo?"));
        deacuerdo.add(new JCheckBox());
        
        JPanel enviar = new JPanel();
        enviar.add(new JButton("Enviar"));
        
        
        JPanel panel2 = new JPanel ();
        panel2.setLayout(new BorderLayout());
        
        panel2.add(genero,BorderLayout.NORTH);
        panel2.add(deacuerdo,BorderLayout.CENTER);
        panel2.add(enviar,BorderLayout.SOUTH);
        
        
        JPanel panel3 = new JPanel ();
        
        panel3.setLayout(new GridLayout(2,1));
        panel3.add(panelS);
        panel3.add(panel2);
        
        
        contenidoPanel.add(panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
    }
    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Ejercicio4 gui = new Ejercicio4();
            }
        });
    }
}
