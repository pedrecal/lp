#include <stdlib.h>
#include <stdio.h>
#include <strings.h>

#define lin 3
#define col 3
int main ()
{	
	int matriz[lin] [col];
	int i, j, k, soma = 0, produtorio = 1, maior = 0, menor = 0;

	for(i = 0; i < lin; i++)
	{
		for(j = 0; j < col; j++)
		{
			printf("Informe o elemento, da linha %d, e coluna %d: ", i+1, j+1);
			scanf("%d", &matriz[i] [j]);
		}
	}
	printf("\n");

	for(i = 0; i < lin; i++)
	{
		for(j = 0; j < col; j++)
		{
			printf("%4d\t", matriz[i] [j]);
		}
		printf("\n");
	}
	
	menor = matriz[0][0];	

        for(i = 0; i < lin; i++)
        {
                for(j = 0; j < col; j++)
                {
                	soma += matriz[i][j];
			produtorio *= matriz[i][j];
			
			if(matriz[i][j] > maior)
			{
				maior = matriz[i][j];
			}
			if(matriz[i][j] < menor)
			{
				menor = matriz[i][j];
			}
                }
        }

	printf("O produtorio é: %d\n", produtorio);
	printf("O maior é: %d\n", maior);
	printf("O menor é: %d\n", menor);
	printf("A soma dos elementos é: %d", soma);

	printf("\n");
return 42;
}
