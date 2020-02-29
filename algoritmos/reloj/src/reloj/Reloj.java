/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import javax.swing.JOptionPane;

/**
 *
 * @author HRL56
 */
public class Reloj {

    public static double anguloManecillas(double hora, double min) {
        int Vhora = 30; //grados
        int Vmin = 6; //grados
        double res = 0;

        if (hora >= 1 && hora <= 12 && min >= 0 && min <= 60) {
            double gHora = hora * Vhora;
            double gMin = min * Vmin;
            res = Math.abs(gHora - gMin);
            if (res > 180) {
                res -= 360;
                res = Math.abs(res);
            }

        }

        return res;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String a = JOptionPane.showInputDialog(null, "Ingresa hora : ");
        String a1 = JOptionPane.showInputDialog(null, "Ingresa min: ");
        double b = anguloManecillas(Double.parseDouble(a), Double.parseDouble(a1));

        JOptionPane.showMessageDialog(null, b);

    }

}
