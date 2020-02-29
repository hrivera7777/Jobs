/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoi;

/**
 *
 * @author HRL56
 */
public class TorreHanoi {

    /**
     * @param args the command line arguments
     */
    
    public static void moverTorre(int altura, String posteI, String posteF, String posteA){
        
        if(altura >=1){
            moverTorre(altura-1, posteI, posteA, posteF);
            System.out.println("Mover disco del poste "+ posteI + " al poste "+ posteF);    
            moverTorre(altura-1, posteA, posteF, posteI);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        moverTorre(5, "inicial", "final", "auxiliar");
    }
    
}
