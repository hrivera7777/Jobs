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
public class listaNumeros {
    
    public static void mostrar(char [] resultado){
        
        for (int i = 0; i < resultado.length; i++) {
            System.out.print( resultado[i]);
        }
        System.out.println("\n");
    }
    
    public static void numerosCon (char [] num, int tam, int n, char [] res, int cifras, int dos){ // tam = tamaño del arreglo inicial, n= numero de cifras a tomar (cifras finales) 
            
        if(cifras == n){
            mostrar(res);
        }
        else {
            for (int i = 0; i < tam; i++) {
                res[cifras] = num[i];
                if(dos < tam && tam-i >= n){
                     
                    numerosCon(num, tam, n, res, cifras+1, dos+1);
                
                }
             //   res[i] = ' ';
            }
        }
        
    }
    public static void main(String[] args) {
        //char [] num = {'1','1','5','1', '4','5','1'};
        char [] num = {'1','1','5','1', '4','6','8'};
        
        int n = 4;
        
        char [] res = new char[7];
        
        int cifras = 0;
        numerosCon(num, num.length, n, res, cifras, 0);
    }
}
