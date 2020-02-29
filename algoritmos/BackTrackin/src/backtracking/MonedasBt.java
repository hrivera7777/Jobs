/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking;

/**
 *
 * @author HRL56
 */
public class MonedasBt {
    
    public static void mostrar(int resp[], int nr){
        System.out.println("se regresan");
        for (int i = 0; i < nr; i++) {
            System.out.println("Moneda de :" + resp[i]);
        }
    }
    
    public static void monedas(int valor, int denomina[], int nd, int suma, int resp[], int nr){
        if (suma == valor) {
            mostrar(resp, nr);
        }
        
        else{
            for (int i = 0; i < nd; i++) {
                if(suma + denomina[i] <= valor){
                    resp[nr]=denomina[i];
                    monedas(valor, denomina, nd, suma + denomina[i], resp, nr+1);
                            
                }
            }
            
        }
    }
    
}
