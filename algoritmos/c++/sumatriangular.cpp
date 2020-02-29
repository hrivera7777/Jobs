#include <stdio.h>

typedef int Matriz[10][10];

int sumatriangular(Matriz mat, int n, int i, int j) {
	if (i<n) {
		if (j<n) 
			return mat[i][j]+sumatriangular(mat,n,i, j+1);
		else
			return sumatriangular(mat,n,i+1,i+2);
	}
	else
	  return 0;
}

int sumatriangularinf(Matriz mat, int n, int i, int j) {
	if (i<n) {
		if (j<i) 
			return mat[i][j]+sumatriangularinf(mat,n,i, j+1);
		else
			return sumatriangularinf(mat,n,i+1,0);
	}
	else
	  return 0;
}

void llenar(Matriz mat) {
	int cont=1;
	for (int x=0;x<5;x++)
	   for (int y=0;y<5;y++)
	     mat[x][y]=cont++;
}

int main(void) {
	int m=5;
	Matriz mat;
	llenar(mat);
	printf("\nLa suma de la triangular sup es : %d",sumatriangular(mat,m,0,1));	
	printf("\nLa suma de la triangular inf es : %d",sumatriangularinf(mat,m,0,0));	
}
