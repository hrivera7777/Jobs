/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author HRL56
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    static int  numNodos =5;
    static int ady [][] = new int [numNodos][numNodos];
    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         ady [0][1] =  ady[1][0] = 1;
         
         ady[0][2]= ady[2][0] = 1;
         
         ady[1][2] = ady[2][1] = 1;
       
         ady[2][3] = ady[3][2] =1;
         
         ady[3][4] = ady[4][3]=1;
         
         for(int i=0; i<5; i++){
             
             for(int j=0; j<numNodos; j++){
               if(ady[i][j]!= 1){
                   ady[i][j] =0;
               }   
             }
         }
         
         for(int i=0; i<numNodos; i++){
             for(int j=0; j<numNodos; j++){
                 System.out.print(ady[i][j]);
                 
             }
                System.out.println("");
         }
        
         
         int [] nodos = new int [numNodos];
        
         
         for(int i=0; i<numNodos; i++){
             nodos[i] = i;
             
         }
        
    }
    
}
