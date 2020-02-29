#include <stdio.h>
#include <string.h>
#include <stdlib.h>


# define TAM 3
# define MAX 36300
# define FINAL "12345678 "

typedef char Matriz [TAM * TAM+2];
Matriz vector[MAX];




void mostrar_jugadas(Matriz tablero){
	for(int i=0; i<TAM * TAM +1; i++)
		printf("%s", tablero[i]);
	
	
}

bool iguales (Matriz a, Matriz b){
	if(strcmp(a,b)==0){
		return true;
	}
	else
		return false;
}



bool solucion(Matriz tablero){
	if(strcmp(tablero, FINAL)==0)
		return true;
	else
		return false;
}

bool esta(Matriz tablero){
	for(int x=0; x<TAM*TAM+1; x++){
		if(iguales(tablero, vector[x]))
		return true;
	}
	return false;
}




bool factible (Matriz tablero, int x1, int y1, int x2, int y2){
	if(x2>=1 && x2<= TAM && y2 >=1 && y2 <= TAM && !esta(tablero))
		return true;
	else 
		return false;
}


void puzzle (Matriz tablero, int nr, int vecX[], int vecY[], int px, int py){
	
	if(solucion(tablero))
		mostrar_jugadas(tablero);
	
	else{
		for(int z = 1; z<=4; z++){
			mover(tablero, px, py, px+vecX[z], py+vecY[z]);
			if(factible (tablero, px, py, px+vecX[z], py+vecY[z] )){
				agregar(tablero);
				puzzle(tablero, nr+1,vecX,vecY,px+vecX[z], py+vecY[z]);
				quitar(tablero);
			}
			mover(tablero, px, py, px+vecX[z], py+vecY[z]);
		}
	}	
	
}



int main(void)
{
  int x;
  char tablero [] ={' ','1','2','6','4','5','3','8','7'};
  
  
  system("color f0");
  cs=0;
  ce=0;
  
   int vecX[]={0,-1, 0, 1, 0};
   int vecY[]={0, 0,-1, 0, 1};


  
  puzzle(tablero, 0, vecX, vecY, 0,0);
  
  //reinas(tablero, 1);
  //printf("\nNumero total de ensayos : %7.0f\n",ce);
  for (x=1;x<=8;x++)
    printf("%d ",tablero[x]);
}

