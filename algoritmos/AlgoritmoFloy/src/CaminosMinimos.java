/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hans Rivera
 */
public class CaminosMinimos {

    //metodo para determinar todos los caminos de un grafo floyd
    public String algoritmoFloyd(long[][] mAdy) { //matriz de tipo long para la matriz de adyacencias

        int vertices = mAdy.length;

        long[][] matrizAdyacencia = mAdy;

        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminitos = "";
        int i, j, k;

        float temporal1, temporal2, temporal3, temporal4, minimo;

        // Inicializando la matrices caminos y caminosAuxiliares
        for (i = 0; i < vertices; i++) {

            for (j = 0; j < vertices; j++) {

                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }

        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {

                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;

                    // encontrando al minimo
                    minimo = Math.min(temporal1, temporal4);

                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminoR(i, k, caminosAuxiliares, caminoRecorrido) + (k + 1);

                        }

                    }
                    matrizAdyacencia[i][j] = (long) minimo;

                }

            }

        }

        //Agregando el camnino minino a cadena
        for (i = 0; i < vertices; i++) {

            for (j = 0; j < vertices; j++) {

                cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";

            }
            cadena = cadena + "\n";
        }

        ////////////////////////////////////////////
        for (i = 0; i < vertices; i++) {

            for (j = 0; j < vertices; j++) {

                if (matrizAdyacencia[i][j] != 1000000000) {

                    if (i != j) {

                        if (caminos[i][j].equals("")) {
                            caminitos += "De (" + (i + 1) + " --->" + (j + 1) + ") irse por...(" + (i + 1) + ", " + (j + 1) + ")\n";

                        } else {
                            caminitos += "De (" + (i + 1) + " --->" + (j + 1) + ") irse por...(" + (i + 1) + ", " + caminos[i][j] + ", " + (j + 1) + ")\n";
                        }

                    }
                }

            }
        }

        return "La matriz de caminos más cortos entre los diferentes vértices es:\n"+cadena+ "\nLos diferentes caminos mas cortos entre vértices son:\n"+caminitos;
    }

    
    public String caminoR(int i, int k, String [][]caminosAuxiliares, String caminoRecorrido  ){
        
        
        if(caminosAuxiliares[i][k].equals("")){
            return"";
            
            
        }else{
            //resursividad al millon 
            return caminoRecorrido += caminoR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido)+ (Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+", ";
            
        }
        
        
    }
    
    
}
