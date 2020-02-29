#include <stdio.h>
//#include <string.h>
//#include <stdlib.h>
int cs;
float ce;

void mostrar(char cad[], int tam, int resp[], int nr){
	//printf("\nSolucion : %d \n",cs);
	 printf("\nSolucion : %d de %7.0f ensayos\n",cs,ce);
	for(int i=0; i<nr; i++)
		printf("%c ", cad[resp[i]]);
	getchar();
}

bool factible(int resp[], int nr, int i){
	for(int x=0; x<nr; x++){
		if((resp[x] == i) || (resp[x]>i)) {	//  o >=
			return false;
		}
	}
	return true;
}

bool esta(int resp[], int nr, int i){
	for(int x=0; x<nr; x++){
		if(resp[x] == i){
			return true;
		}
		
	}
	return false;
}

bool posRel(int resp[], int nr, int i){
	for(int x=0; x<nr; x++){
		if(resp[x] > i){
			return false;
		}
		
	}
	return true;
}


void cifras(char cad[], int tam, int resp[], int nr, int n){
	if(nr == n){
		cs++;
		mostrar(cad, tam, resp, nr);
	} else{
		for(int i=0; i<tam; i++){
			ce++;
			if(factible(resp, nr, i)){
			//	if(!esta(resp, nr, i)&&posRel(resp,nr,i)){
				resp[nr] = i;
				cifras(cad, tam, resp, nr+1, n);
				resp[nr] = -1;
			}
		}
	}
}



//*******************************************************************************

int main(void){
	
	char cad[] = {'1','1','5','1','4','5','1'}; //char cad[] = {'1','1','5','9','4','5','8'};  	
	int tam = 7;
	cs=0;
	int resp[] = {-1};
	int nr = 0;
	int n = 4;
	//	printf("%d ", cad[resp[i]]);
	cifras(cad, tam, resp, nr, n);
	
	

}
