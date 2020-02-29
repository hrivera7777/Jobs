/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author HRL56
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    static int[][] multMat(int[][] matx, int[][] maty, int m, int p, int n, int i, int j, int k, int resul[][]) {

        if (i < m) {
            if (j < n) {
                if (k < p) {
                    resul[i][j] += (matx[i][k] * maty[k][j]);
                    return multMat(matx, maty, m, p, n, i, j, k + 1, resul);
                } else {
                    return multMat(matx, maty, m, p, n, i, j + 1, 0, resul);
                }
            } else {
                return multMat(matx, maty, m, p, n, i + 1, 0, 0, resul);
            }
        } else {

            return resul;
        }
    }

    static int sumDiagSeg(int[][] mat, int n, int i, int j) {
        if ((i < n) && (j >= 0)) {
            return mat[i][j] + sumDiagSeg(mat, n, i + 1, j - 1);
        } else {
            return 0;
        }
    }
    
    
    static int sumDiagoSegun(int [][] mat, int n, int i){
        if(i<n){
            return mat[i][n-i] + sumDiagoSegun(mat, n, i+1);
        }
        else{
            return 0;
        }
        
    }

    static boolean busqBinRec(int[] vec, int tam, int num, int izq, int der) {

        int centro = (izq + der) / 2;
        if (der < izq) {
            return false;
        } else if (num < vec[centro]) {
            return busqBinRec(vec, tam, num, centro, der - 1);
        } else if (num == vec[centro]) {
            return true;
        } else {
            return busqBinRec(vec, tam, num, centro + 1, der);
        }

    }

    public static boolean busqBinaria(int vec[], int num, int izq, int der) { // corregida
        if (izq > der) {
            return false;
        } else {
            int centro = (izq + der) / 2;
            if (vec[centro] == num) {
                return true;
            } else if (vec[centro] > num) {

                return busqBinaria(vec, num, izq, centro - 1);
            } else {
                return busqBinaria(vec, num, centro + 1, der);
            }

        }
    }

    static int fibo(int termN) {
        if (termN == 0 || termN == 1) {
            return termN;
        } else {
            return fibo(termN - 1) + fibo(termN - 2);
        }
    }

    static boolean primRec2(int num, int i) {//definitivo

        if (i > num) {
            System.out.println("uno " + num + "," + i);
            return true;
        } else if ((num % i) == 0) {
            System.out.println("dos " + num + "," + i);
            return false;
        } else {
            System.out.println("tres " + num + "," + i);
            return primRec(num, i + 1);
        }
    }

    static boolean primRec(int num, int i) {

        if ((num % i) == 0 && i < num) {
            System.out.println("uno " + num + "," + i);
            return false;
        } else if (i < num) {
            System.out.println("dos " + num + "," + i);
            return primRec(num, i + 1);
        } else {
            System.out.println("tres " + num + "," + i);
            return true;
        }
    }

    public static int mayVecRec(int vec[], int tam, int inicial) {
        if (tam == 0) {
            return inicial;
        } else if (vec[tam] > inicial) {
            return mayVecRec(vec, tam - 1, vec[tam]);
        } else {
            return mayVecRec(vec, tam - 1, inicial);
        }

    }

    static int repRec(int[] vec, int cont, int ini, int num, int veces) {

        if (ini == vec.length - 1) {
            return num;
        } else if (vec[ini] == vec[ini + 1]) {
            return repRec(vec, cont + 1, ini + 1, num, veces);

        } else if (cont > veces) {
            return repRec(vec, 1, ini + 1, vec[ini], cont);
        } else {
            return repRec(vec, 1, ini + 1, num, veces);
        }
    }

    static boolean palindroRec(char[] palabra, int tam, int ini) {
        if (ini == tam) {
            return true;
        } else if (palabra[ini] == palabra[tam]) {
            return palindroRec(palabra, tam - 1, ini + 1);
        } else {
            return false;
        }
    }

    static int trazaRec(int[][] mat, int i, int j) {//suponiendo que la matriz es cuadrada
        if (i < mat.length) {
            if (j < mat.length) {
                if (i == j) {
                    return trazaRec(mat, i, j + 1) + mat[i][j];
                } else {
                    return trazaRec(mat, i + 1, j);
                }
            }
        }
        return 0;
    }

    static boolean busqElmMatRec(int[][] mat, int i, int j, int elm) {
        if (elm == mat[i][j]) {
            return true;
        } else if (i < mat.length) {
            if (j < mat[0].length - 1) {
                System.out.println("uno " + (i) + ", " + (j));//prueba
                return busqElmMatRec(mat, i, j + 1, elm);

            } else {
                System.out.println("dos " + (i) + ", " + (j));//prueba
                return busqElmMatRec(mat, i + 1, 0, elm);
            }
        } else {
            return false;
        }

    }

    static int[][] sumMatRec(int[][] mx, int[][] my, int i, int j, int[][] resul) {
        if (i < mx.length) {
            if (j < mx[0].length) {
                resul[i][j] = mx[i][j] + my[i][j];
                return sumMatRec(mx, my, i, j + 1, resul);
            } else {
                resul[i][0] = mx[i][0] + my[i][0];
                return sumMatRec(mx, my, i + 1, 0, resul);
            }
        }
        return resul;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int vec[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(busqBinRec(vec, 7, 6, 0, vec.length - 1));

        int vec2[] = {2, 5, 7, 5, 9, 7, 1};
        int vec3[] = {1, 2, 3, 3, 4, 5, 6, 7};
        System.out.println(mayVecRec(vec2, 6, 1));
        System.out.println(masrepiteord(vec3, 6));
        System.out.println(repRec(vec3, 0, 0, 1, 0));

        char[] word = {'o', 's', 'o'};
        System.out.println(palindroRec(word, 2, 0));

        int mat[][] = {{2, 1, 3},
        {5, 6, 7},
        {8, 9, 4}};
        int mat3[][] = {{2, 1, 3}, {5, 6, 7}, {8, 9, 4}};
        int mat4[][] = sumMatRec(mat, mat3, 0, 0, new int[3][3]);

        int mat2[][] = {{2, 1, 3},
        {5, 6, 7},
        {8, 9, 4},
        {10, 11, 12}};

        int mat8[][] = {{2, 1, 3},
        {5, 6, 7},
        {8, 9, 4}};

        int mat5[][] = {{2, 1, 3}, {5, 6, 7}, {8, 9, 4}, {10, 11, 12}};

        int mat6[][] = sumMatRec(mat2, mat5, 0, 0, new int[4][3]);

        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n\n\n");
        int mat10[][] = new int[mat2.length][mat8[0].length];
        int mat7[][] = multMat(mat2, mat8, mat2.length, mat2[0].length, mat8[0].length, 0, 0, 0, mat10);

        for (int[] mat1 : mat7) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n\n\n\n");

        System.out.println("");
        System.out.println(trazaRec(mat, 0, 0));
        System.out.println("");
        System.out.println("diagonal seg");
        System.out.println(sumDiagSeg(mat, mat.length, 0, mat.length - 1));
        System.out.println();
        System.out.println(busqElmMatRec(mat2, 0, 0, 12));

        for (int[] mat1 : mat6) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println(fibo(8));

        System.out.println("");
        System.out.println(primRec2(17, 2));// debe empezar en 2

    }

    static int masrepiteord(int vector[], int n) {//prueba traida de c++
        int mas = 0, veces = 0, cont = 1;
        for (int i = 0; i < n - 1; i++) {
            if (vector[i] == vector[i + 1]) {
                cont++;
            } else {
                if (cont > veces) {
                    veces = cont;
                    mas = vector[i];
                }
                cont = 1;
            }

        }
        return mas;

    }

}
