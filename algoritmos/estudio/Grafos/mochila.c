#include <stdio.h>
#define MAX 10 
#define  INF 999999
typedef int Matriz [MAX][MAX];


void mostrarLista(int *camino, int n) { //se podria haber hecho camino[]

    for(int i = 0; i < n; i++) {
           printf("%d ", (*(camino + i))); // o tambien camino[i]
        }   
}


int esta(int camino[], int tam, int i) {

    for(int j =0; j<tam; j++) {

        if(camino[j] == i) {

            return 1;
        }
    }
    return 0;
}

/*void ordenTazas (int tazas[], int n, int pesos[], int precios[] ){
    for (int i = 0; i < n-1; i++)
    {
        for (int j= i+1; j< n-1; j++)
        {
            if(tazas[i]<tazas[j]){
                 int aux=tazas[i];
                tazas[i]=tazas[j];
                tazas[j]=aux;
                aux=pesos[i];
                pesos[i]=pesos[j];
                pesos[j]=aux;
                aux=precios[i];
                precios[i]=precios[j];
                precios[j]=aux;
            }
        }
    }
}
*/

/*
void mejorCombinacion(int id[], int pesos[], int precios[], int tam, int mochila) {

int tazas[tam];
int acomulador=0;
int conjunto[tam];
int j=0;

    for(int i=0; i<tam; i++) {
        tazas[i] = precios[i]/pesos[i];
    }

    ordenTazas(tazas,tam,pesos,precios);
    while(acomulador<mochila)
    {
        if((acomulador + pesos[j]) <= mochila)
        {
            acomulador = acomulador + pesos[j];
            conjunto[j] = id[j];
            j++;
        }
        else{
            conjunto[j] = (mochila-acomulador)/pesos[j];
            acomulador = mochila;
        }
    }
    
    
    
   
}

*/
/*
void devolverCambio(int monedas[], int pagar, int n) {
 
    int acumulador = 0;
    int conjunto[] = {0, 0, 0, 0, 0, 0};
    int tipoMoneda = 0;
    while(acumulador < pagar) {
    if (pagar - (acumulador + monedas[tipoMoneda]) >= 0) {

        acumulador += monedas[tipoMoneda];
        conjunto[tipoMoneda] += 1;        

    } else {
        tipoMoneda++;
    }
    }

 mostrarLista(conjunto, n);
}
*/
int coloreable(int matrizAdy, int n, int pais, int color) {

    for(int vecino = 0; vecino<n; vecino++) {

        if(matrizAdy[pais][vecino] == color)
    }
}
void colorearMapa(int matrizAdy, int n)  {

int coloresUsados [n];
    for (int pais=0; pais<n ; pais++ ) {
    
        for(int colores = 0; colores<n; colores++) {

              if(coloreable(matrizAdy, n,pais, colores, coloresUsados)) {


                }
        }

    }

}

void main () {

/*
int monedas[] = {1000, 5, 4, 3, 2, 1};
int pagar = 3725;
devolverCambio(monedas, pagar, 6);
*/
/*char elementos[] = {1, 2, 3, 4};
int pesos[] = {7, 5, 6, 8};
int precios[] = {3, 2, 1, 4};
int mochila = 20; //capacidad respecto a peso, nos importa la mejor relacion peso/precio
mejorCombinacion(elementos, pesos, precios, 4, mochila);
*/
}