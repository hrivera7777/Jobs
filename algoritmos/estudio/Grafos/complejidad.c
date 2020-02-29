#include <stdio.h>

int busquedaBinaria(int vector [], int n, int valor, int inicio, int fin) {

int medio = (fin - inicio) / 2;

    if(inicio > fin) {
        return 0;
    }

    if(vector[medio] == valor) {
        return 1;

    } else {
        if(vector[medio] < valor) {
            return busquedaBinaria(vector, n, valor, inicio, medio-1);
        } else {
            return busquedaBinaria(vector, n, valor, medio+1, fin);
        }
    }
}


int main() {

int vec [] = {3, 8, 9 ,12, -1, 12};
printf("%d", busquedaBinaria(vec, 6, 9, 0, 5));


}