/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hans Rivera
 */
public class AlgoritmoFloy {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        long matrizA[][]  = {{0,3,4,999999999,8,999999999},{999999999,0,999999999,999999999,5,999999999},{999999999,999999999,0,999999999,3,999999999},{999999999,999999999,999999999,0,999999999,999999999},{999999999,999999999,999999999,7,0,3},{999999999,999999999,999999999,2,999999999,0}};
        CaminosMinimos ruta = new CaminosMinimos();
        
        System.out.println(ruta.algoritmoFloyd(matrizA));
        
        
        
    }
    
}
