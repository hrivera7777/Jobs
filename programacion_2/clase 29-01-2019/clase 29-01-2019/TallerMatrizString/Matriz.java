package TallerMatrizString;


/**
 * 
 * 
 * @author Hans Rivera, Jorge L. Ordoñez
 * 
 */

import java.util.Scanner;
public class Matriz{   
    
    private int tamañoFilas, tamañoColumnas;
    private int [][] matriz = new int [10][10];;
    
    public Matriz (){
        
    }
    
    public void leerMatriz (){
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se lee el tamaño de la matriz: ");
        System.out.println("filas: ");
        tamañoFilas=teclado.nextInt();
       
        System.out.println("columnas: ");
        tamañoColumnas=teclado.nextInt();
        
        for(int i=0; i<tamañoFilas; i++){
            
            for(int j=0; j<tamañoColumnas; j++){
                System.out.println("Se lee los datos de de la fila: "+ (i+1) + " y la columna: " + (j+1) );
                matriz[i][j]= teclado.nextInt();
                
            }
            
        }
        
    }
    
    public void visualizar (){
        
        for(int i=0; i<tamañoFilas; i++){
            
            System.out.println("");
            for(int j=0; j<tamañoColumnas; j++){
                
                System.out.print(matriz[i][j] );
                System.out.print(" ");
              
                
            }
            
        }
        
    }
    
    public void mostrarElementoMayor(){
        int mayor=matriz[0][0];
        int posicionFila=0;
        int posicionColumna=0;
        
        for(int i=0; i<tamañoFilas; i++){
            
            
            for(int j=0; j<tamañoColumnas; j++){
                
                if (matriz[i][j]>mayor){
                    mayor = matriz[i][j];
                    posicionFila=i;
                    posicionColumna=j;
                }
              
                
            }
            
        }
        System.out.println("El valor mayor de la matriz es: " + mayor+ " y su posición es: " + posicionFila + " - " + posicionColumna );
        
    }
    
    public void mostrarElementoMenor(){
        int menor=matriz[0][0];
        int posicionFila=0;
        int posicionColumna=0;
        
        for(int i=0; i<tamañoFilas; i++){
            
            
            for(int j=0; j<tamañoColumnas; j++){
                
                if (matriz[i][j]<menor){
                    menor = matriz[i][j];
                    posicionFila=i;
                    posicionColumna=j;
                }
              
                
            }
            
        }
        System.out.println("El valor menor de la matriz es: " + menor+ " y su posición es: " + posicionFila + " - " + posicionColumna );
        
    }
    
    public static void main(String args[]){
        
        Matriz miMatriz = new Matriz ();
        miMatriz.leerMatriz();
        miMatriz.visualizar();
        miMatriz.mostrarElementoMayor();
        miMatriz.mostrarElementoMenor();
    }


}
    