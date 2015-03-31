#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define N 50

int main ()
{
	int matriz[N][N], l, c, i = 0, j = 0;
	
	printf("\nEntre com o numero de linhas da matriz: \n");
	scanf("%d", &l);
	printf("\nEntre com o numero de colunas da matriz: \n");
	scanf("%d", &c);
	
	if(l && c < 50)
	{
		for(i = 0; i < l; i++)
		{
			for(j = 0; j < c; j++)
			{
				printf("Entre com o numero a ser ocupado na linha %d, e coluna %d: ", i, j);
				scanf("%d", &matriz[i][j]);
			}
			printf("\n");
		}

		for(i = 0; i < l; i++)
	        {
        	        for(j = 0; j < c; j++)
			{
				printf("%4d\t", matriz[i][j]);
                	}
			printf("\n");
		}
		
		if(l == c)
		{
			printf("A matriz é quadrada\n");
		}
		else
		{
			printf("A matriz não é quadrada");
		}
	}
	
	else
	{	
		printf("\nA matriz deve ser menor que 50\n");
	}
return 42;
}
