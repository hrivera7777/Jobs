#include <stdio.h>
#define MAX 10 
#define  INF 999999
typedef int Matriz [MAX][MAX];
/*
void llenarInf(Matriz matriz, int n) {

    for(int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            matriz[i][j] = INF;

        }   
    }
}
*/
void mostrarMatriz(Matriz matriz, int n) {

    for(int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

           printf("%d ", matriz[i][j]);

        }   
           printf("\n");
    }
}

void mostrarLista(int *camino, int n) { //se podria haber hecho camino[]

    for(int i = 0; i < n; i++) {
           printf("%d ", (*(camino + i))); // o tambien camino[i]
        }   
}

/*void menorCamino (Matriz matrizAdy, int n, int origen, int destino) {
    int menorC [n], tamC = 0;
    while(origen != destino) {
        int posicion = 0, menorPeso = INF; // posicion del menor peso
        for(int i = 0; i < n; i++) {
            if(matrizAdy[origen][i] < menorPeso) {
                menorPeso = matrizAdy[origen][i];
                posicion = i;
            }
        }
        origen = posicion;
        menorC[tamC++] = posicion;
    }
    mostrarLista(menorC, tamC);
}
*/

int esta(int camino[], int tam, int i) {

    for(int j =0; j<tam; j++) {

        if(camino[j] == i) {

            return 1;
        }
    }
    return 0;
}

/*void mostrarAgenteViajero(Matriz viajero, int n, int nodoI) { // nodoI  = 2

    int  tam = 0;
    int camino [INF];
    int nodoHaciaMenor = 0;
    camino[tam++] = nodoI;
    while (tam < n) {
        int menor = INF;
         for(int i=0; i<n; i++ ) {
            if(viajero[nodoI][i] < menor && !esta(camino, tam, i) ) { // si el elemento del vector es menor al elemento en la variable menor -> se actualiza menor
                 menor = viajero[nodoI][i];
                 nodoHaciaMenor = i;
             }
          }
           camino[tam++] = nodoHaciaMenor;
           nodoI = nodoHaciaMenor;
    }


mostrarLista(camino, tam);
}

*/

void main () {

//                         1    2   3   4   5
Matriz viajero = {  /*1*/{INF, 45, 40, 30, 50},
                    /*2*/{45, INF, 10, 55, 35},
                    /*3*/{40, 10, INF, 20, 25},
                    /*4*/{30, 55, 20, INF, 15},
                    /*5*/{50, 35, 25, 15, INF}};
            
mostrarAgenteViajero(viajero, 5, 3);

//llenarInf(ale,5);  // usar para inicializar de manera ale[nodoOrigen][nodoDestino] = pesoArista
//mostrarMatriz(ale,5);
//menorCamino(ale, 5, 0, 4);
}