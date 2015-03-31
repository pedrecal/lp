#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[])
{
	float **a, *b, *c;
	int lca, i, j, n = 0, p = 1;

	printf("Digite a dimensao da matriz quadrada(linha = coluna)\n");
	scanf("%d", &lca);

	a = malloc(lca *sizeof(float *));
	b = malloc(lca *sizeof(float));

	if(a == NULL || b == NULL)
	{
		printf("Error!\n");
		return -1;
	}

	for(i = 0; i < lca; i++)
	{
		a[i] = malloc(lca *sizeof(float *));

		if (a[i] == NULL)
		{
			printf("Error!\n");
			return -1;
		}
	}

	a = lca[0][0];
	b = lca[0][0];

	for (i = 0; i < lca; ++i)
	{
		printf("Entre com os valores para a posicao [%d][%d]: \n", i+1, i+1);
		scanf("%f", &a[i][i]);

		if (a[i][i] < 0)
		{
			n++;
			p *= a[i][i];
		}
		if (a[i][i] > *b)
		{
			c = b;
			b = &lca[i][i];
		}
		if (*b > lca[i][i] && *c < lca[i][i])
		{
			c = &lca[i][i];
		}
	}

	for (i = 0; i < lca; ++i)
	{
		printf("%.2f \t", a[i][i]);

		if (a[i][i] < a[i+1][i+1])
		{
			for (j = 0; j < lca; ++j)
			{
				
			}
		}
	}
	
	printf("A matriz tem %d elementos negativos\n", n);
	printf("O produto de todos os elementos dessa matriz eh igual a %d\n", p);
	printf("O maior elemento eh: %f e o segundo maior: %f\n",*b, *c);

	return 0;
}