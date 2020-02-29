public class Matriz {
    public static void main (String args[]){
        int[][] tabla = new int [4][7];
        for (int i=0; i< tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++){
                tabla[i][j] = i + j;
            }
        }
        
        for(int i=0; i<tabla.length; i++){
            
            for (int j=0; j<tabla[i].length; j++){
                System.out.print(" "+ tabla[i][j]);
            }
            System.out.println();
        }
        
    }
        
}