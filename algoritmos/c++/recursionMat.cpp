#include <stdio.h>

#define MAX 15

typedef int Matriz[MAX][MAX];

void burbujaRec(int vector[], int n, bool cambios, int x) {
	if (x<n-1) {
	   if (vector[x]>vector[x+1]) {
	   	  int temp=vector[x];
	   	  vector[x]=vector[x+1];
	   	  vector[x+1]=temp;
	   	  burbujaRec(vector,n,true,x+1);
	   }
	   else
	     burbujaRec(vector,n,cambios,x+1);
	}
	else	
	   if (cambios) 
	     burbujaRec(vector,n-1,false,0);
}

void burbuja(int vector[], int n) {
	bool cambios;
	do {
		cambios=false;
		for (int x=0;x<n-1;x++) {
		   if (vector[x]>vector[x+1]) {
		   	  int temp=vector[x];
		   	  vector[x]=vector[x+1];
		   	  vector[x+1]=temp;
		   	  cambios=true;
		   }
		}
		n--;
	} while (cambios);
}

int trazaMat(Matriz mat, int n) {
	if (n==0)
	  return 0;
	else
	  return mat[n-1][n-1]+trazaMat(mat,n-1);
}

int trazaMat(Matriz mat, int m, int n, int i, int j) {
	if (i<m) 
		if (j<n) 
			if (i==j)
			   return mat[i][j]+trazaMat(mat,m,n,i,j+1);
			else
			   return trazaMat(mat,m,n,i,j+1);
		else 
			return trazaMat(mat,m,n,i+1,0);
	else
	  return 0;
}


int sumaMat(Matriz mat, int m, int n, int i, int j) {
	if (i<m) {
		if (j<n) 
			return mat[i][j]+sumaMat(mat,m,n,i,j+1);
		else 
			return sumaMat(mat,m,n,i+1,0);
	}
	else
	  return 0;
}

int sumaMat(Matriz mat, int m, int n, int i, int j, int suma) {
	if (i<m) {
		if (j<n) {
			suma += mat[i][j];
			return sumaMat(mat,m,n,i,j+1,suma);
		}
		else {
			return sumaMat(mat,m,n,i+1,0,suma);
		}
	}
	else
	  return suma;
}

void transpuestaMat(Matriz mat, int &m, int &n, int i, int j) {
	if (i<m) {
		if (j<n) {
			int temp=mat[i][j];
			mat[i][j]=mat[j][i];
			mat[j][i]=temp;
			transpuestaMat(mat,m,n,i,j+1);
		}
		else {
			transpuestaMat(mat,m,n,i+1,i+2);
		}
	}
	else {
		int temp=m;
		m=n;
		n=temp;
	}
}


void mostrarMat(Matriz mat, int m, int n, int i, int j) {
	if (i<m) {
		if (j<n) {
			printf("%4d",mat[i][j]);
			mostrarMat(mat,m,n,i,j+1);
		}
		else {
			printf("\n");
			mostrarMat(mat,m,n,i+1,0);
		}
	}
}

void llenarMat(Matriz mat, int &m, int &n){
	int cont=1;
	m=6;
	n=8;
	for (int x=0;x<m;x++)
	  for (int y=0;y<n;y++)
	    mat[x][y]=cont++;
}

void mostrarVec(int *vec, int n) {
	printf("\nEl vector queda : \n");
	for (int x=0;x<n;x++)
	   printf("%4d",vec[x]);
}

int main(void) {
	Matriz mat;
	int m,n,suma=0;
	/*
	llenarMat(mat,m,n);
	mostrarMat(mat,m,n,0,0);
	//sumaMat(mat,m,n,0,0,suma);
	printf("\nLa suma es : %d",sumaMat(mat,m,n,0,0));
	transpuestaMat(mat,m,n,0,1);
	printf("\nLa transpuesta es : \n");
	mostrarMat(mat,m,n,0,0);*/
	int vector[]={2,5,6,1,8,12,9,6};
	n=8;
	mostrarVec(vector,n);
	burbujaRec(vector,n, false,0);
	mostrarVec(vector,n);
}
