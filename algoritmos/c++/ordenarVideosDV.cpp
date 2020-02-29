#include <stdio.h>
#include <string.h>
#define MAX 20
#define INF 9999

typedef struct {
    int duracion;
    char secuencia[];
}video;

typedef video videotype[MAX];

void fusion(videotype vec, int izq,int fizq, int der, int fder, videotype temp);

void ordenarVideos(videotype vec, int ini, int fin, videotype temp){
	int mitad;
	
	if(ini<fin){
		mitad = (ini+fin)/2;
		ordenarVideos(vec,ini, mitad, temp);
		ordenarVideos(vec,mitad+1, fin, temp);
		fusion(vec,ini, mitad, mitad+1, fin, temp);
	}
	
	
}

void fusion(videotype vec, int izq,int fizq, int der, int fder, videotype temp){
	
	int numEle = fder-izq +1;
	int z = izq;
	
	while(izq<= fizq && der <= fder){
		if(vec[izq].duracion <= vec[der].duracion){
			temp[z++] = vec[izq++];
		}
		else{
			temp[z++] = vec[izq++];
		}
	}
	while(izq<= fizq){
		temp[z++] = vec[izq++];
	}
	
	while(der <= fder){
		temp[z++] = vec[der++];
	}
	for(int i=0; i< numEle; i++,fder--){
		vec[fder] = temp[fder];
	}
}
