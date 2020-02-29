/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloresmapa;

/**
 *
 * @author HRL56
 */
import java.util.Arrays;

public class ColoresMapa {

    /**
     * @param args the command line arguments
     */
    static boolean esta(int[] colores, int color) {

        for (int i = 0; i < colores.length; i++) {
            if (colores[i] == color) {
                return true;
            }
        }
        return false;
    }

    static int[] coloreado(boolean[][] ady) {
        int colores[] = new int[ady.length];

        int pais = 0;
        int color;
        int i;
        while (pais < ady.length) {

            for (i = 0; i < ady.length; i++) {
                for (color = 1; color <= ady.length; color++) {
                   // System.out.println("esta es la I" + i);
                    if (ady[pais][i] && !esta(colores, color)) {
                        
                        colores[pais]= color;
                        break;
                        
                    } else if(!ady[pais][i] && i!=color) {
                        colores[pais]= color;
                        break;
                        
                    }
                }
            }
            pais++;

        }

        return colores;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean mapa [][] = {{false, true, true, false}
                             ,{true, false, true, true}
                             ,{true, true, false, true}
                             ,{false, true, true, false}
        };
        
        
        
        /*mapa[0][1] = mapa [1][0] = true;
        mapa[0][2] = mapa [2][0] = true;
        
        mapa[1][2] = mapa [2][1] = true;
        mapa[1][3] = mapa [3][1] = true;
        
        mapa[2][3] = mapa [3][2] = true;
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                if(!mapa[i][j]){
                    mapa[i][j] = false;
                }
            }
        }
        */
        System.out.println(Arrays.toString(coloreado(mapa)));
       
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < mapa.length-1; i++) {
                    System.out.println("esta es la I (hasta -1)" + i);
        
        }
        
        for (int i = 0; i < mapa.length; i++) {
                    System.out.println("esta es la I completa" + i);
        }
        
        
        
    }

}
