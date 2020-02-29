#include <stdio.h>
#include <stdlib.h>

typedef struct lapila {
	int valor;
	struct lapila *sgte;
}TipoPila;

void CrearPila(TipoPila **pila) {
	*pila=NULL;
}

bool VaciaPila(TipoPila *pila) {
	return (pila==NULL);
}

void push(TipoPila **pila, int valor){
	TipoPila *p;
	p=(TipoPila *)malloc(sizeof(TipoPila));
	if (p==NULL) {
		printf("\nERROR : Sin memoria");
		return;
	}
	p->valor=valor;
	p->sgte=*pila;
	*pila=p;
}

int pop(TipoPila **pila) {
	TipoPila *p;
	int valor;
	if (!VaciaPila(*pila)) {
		p=*pila;
		valor=p->valor;
		*pila=(*pila)->sgte;
		free(p);
		return valor;
	}
	else
	  return -1;
}

int ConsultarPila(TipoPila *pila) {
	if (!VaciaPila(pila)) 
		return pila->valor;
	else
	  return -1;
}

void DestruiPila(TipoPila **pila) {
	while (!VaciaPila(*pila))
	   pop(pila);
}

/*****************************************************/
void MostrarPila(TipoPila **pila) {
	TipoPila  *aux;
	CrearPila(&aux);
	printf("\nLa pila tiene : \n");
	while (!VaciaPila(*pila)) {
		int valor=pop(pila);
		printf("\t%d\n",valor);
		push(&aux,valor);
	}
	while (!VaciaPila(aux)){
		int valor=pop(&aux);
		//printf("%d ",valor);
	    push(pila,valor);
    }
}

int MayorPila(TipoPila **pila) {
	int mayor=-9999999;
	TipoPila  *aux;
	CrearPila(&aux);
	while (!VaciaPila(*pila)) {
		int valor=pop(pila);
		if (valor>mayor)
		   mayor=valor;
		push(&aux,valor);
	}
	while (!VaciaPila(aux))
	    push(pila,pop(&aux));
    return mayor;
}

void EliminardePila(TipoPila **pila, int num) {
	int valor;
	TipoPila  *aux;
	CrearPila(&aux);
	while (!VaciaPila(*pila)) {
		int valor=pop(pila);
		if (valor!=num) {
		    push(&aux,valor);
		    break;
		}
	}
	while (!VaciaPila(aux))
	    push(pila,pop(&aux));
}

bool SaberOrdenada(TipoPila **pila) {
	bool orden=true;
	int valor1, valor2;
	TipoPila *aux;
	CrearPila(&aux);
	while (!VaciaPila(*pila)) {
		valor1=pop(pila);
		push(&aux,valor1);
		if (!VaciaPila(*pila)) {
			valor2=ConsultarPila(*pila);
			if (valor1 < valor2) {
				orden=false;
			    break;
		    }
		}
    }
    while (!VaciaPila(aux))
	    push(pila,pop(&aux));
	return orden;
}

void InvertirPila(TipoPila **pila) {
	TipoPila *aux1, *aux2;
	CrearPila(&aux1);
	CrearPila(&aux2);
	while (!VaciaPila(*pila))
	    push(&aux1,pop(pila));
	while (!VaciaPila(aux1))
	    push(&aux2,pop(&aux1));
	while (!VaciaPila(aux2))
	    push(pila,pop(&aux2));
}

void InvertirPilaRec(TipoPila **pila, TipoPila **aux, TipoPila **aux2, int estado)  {
	if (estado==1 && !VaciaPila(*pila)) {
		push(aux,pop(pila));
		InvertirPilaRec(pila, aux, aux2, estado);
	}
	else {
	  estado=2;
	  if (estado==2 && !VaciaPila(*aux)) {
		push(aux2,pop(aux));
		InvertirPilaRec(pila, aux, aux2, estado);
   	  }
   	  else {
	  estado=3;
	  if (estado==3 && !VaciaPila(*aux2)) {
		push(pila,pop(aux2));
		InvertirPilaRec(pila, aux, aux2, estado);
   	  }
   }
   }
	
}

bool pilaOrdenadaAscendente(TipoPila **pila){
	TipoPila *aux;
	CrearPila(&aux);
	int valor1;
	int valor2;
	bool orden=true;
	while(!VaciaPila(*pila)){
		valor1=pop(pila); //Toma el primer valor en la pila.
		//Ojo acá la pila podría estar vacía !!!! *******************
		// Debe verificar antes de consultar el siguiente (solo queda uno y no hay que compararlo)
		if (VaciaPila(*pila)) {
			break;
		}
		valor2=ConsultarPila(*pila); //Consulta el segundo valor en la pila.
		push(&aux,valor1);
		if(valor1>valor2){
			printf("\n Error %d",valor1);
			printf("\n Error %d",valor2);
			orden=false;
			break; //Deja de pasar de pila original a pila auxiliar.
		}
	}
	while(!VaciaPila(aux)){ //De la pila auxiliar a la original
		push(pila,pop(&aux)); //El segundo parámetro devuelve el dato a ingresar en la original
	}
	return orden;
}

/*****************************************************/

int main(void) {
	TipoPila *pila, *aux, *temp;
	CrearPila(&pila);
	CrearPila(&aux);
	CrearPila(&temp);
	//push(&pila,5);
	/*for (int x=1;x<=10;x++)
	   push(&pila, x);
	push(&pila,5);
	MostrarPila(&pila);
	//EliminardePila(&pila,5);*/
	push(&pila,123);
	push(&pila,89);
	push(&pila,87);
	push(&pila,42);
	push(&pila,15);
	push(&pila,6);
	push(&pila,5);
	
	MostrarPila(&pila);
	/*
	if (pilaOrdenadaAscendente(&pila))
	  printf("\nSI ordenada");
	else
	  printf("\nNO ordenada");*/
	InvertirPilaRec(&pila, &aux, & temp, 1);
	MostrarPila(&pila);
	/*
	InvertirPila(&pila);
	MostrarPila(&pila);
	getchar();*/
}


