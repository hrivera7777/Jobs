 
#define TAM  3
#define MAX 363000			// Puede crear 9! Tableros [362880]
#define FINAL " 12345678 “		 // No se utiliza el primer lugar de la cadena

typedef  char Matriz[TAM*TAM+2]; 	//Cada tablero es una cadena de caracteres
Matriz  vector[MAX];                      		// Almacena todos los tableros que genera

bool solucion(Matriz tablero) {
   if (strcmp(tablero, FINAL) == 0)
       return true;
   else
       return false;
}



void puzzle(Matriz  tablero, int  nr, int  vecX[], int  vecY[], int  px, int  py) {
   if  (solucion(tablero))
         mostrar_jugadas(tablero); 
   else {
      for (int  z=1; z<=4; z++) {
            mover(tablero, px, py, px+vecX[z], py+vecY[z]);
            if   (factible(tablero, px, py, px+vecX[z], py+vecY[z]))  {
                 agregar(tablero);
                 puzzle(tablero, nr+1, vecX, vecY, px+vecX[z], py+vecY[z]);
                 quitar(tablero);
             }
             mover(tablero, px, py, px+vecX[z], py+vecY[z]);
        }
   }
}


bool esta(Matriz tablero) {
   for (int x=0; x<nv; x++) {
      if (iguales(tablero,vector[x]))
         return true;
   }
   return false;
}

bool factible(Matriz tablero, int x1, int y1, int x2, int y2) {
    if (x2>=1 && x2<=TAM && y2>=1 && y2<=TAM && !esta(tablero))
       return true;
    else
      return false;
}


bool iguales(Matriz a, Matriz b)
{
   if (strcmp(a,b)==0)
         return true;
   else
          return false;
}

