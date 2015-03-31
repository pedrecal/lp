#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	float **a, **b, **c;
	int la, ca, lb, cb, i, j, k, l;

	printf("Digite as dimensoes(l e c) de A:\n");
	scanf("%d %d", &la, &ca);
	printf("Digite as dimensoes(l e c) de B:\n");
	scanf("%d %d", &lb, &cb);

	if(ca != cb || la != lb)
	{
		printf("Operacao indefinida!!!\n");
		return -1;
	}
	
	a = malloc(la *sizeof(float *));
	b = malloc(lb *sizeof(float *));
	c = malloc(la *sizeof(float *));

	if(a == NULL || b == NULL || c == NULL)
	{
		printf("Error\n");
		return -1;
	}

	for(i = 0; i < la; i++)
	{
		a[i] = malloc (ca *sizeof(float));
		c[i] = malloc (cb *sizeof(float));

		if (a[i] == NULL || c[i] == NULL)
		{
			printf("Error\n");
			return -1;
		}
	}

	for ( i = 0; i < lb; ++i)
	{
		b[i] = malloc(cb *sizeof(float));
		if (b[i] == NULL)
		{
			printf("Error!!\n");
			return -1;
		}
	}

	for ( i = 0; i < la; ++i)
	{
		for ( j = 0; j < ca; ++j)
		{
			printf("Digite A[%d][%d]: \n",i + 1, j + 1);
			scanf("%f", &a[i][j]);
		}
	}

	for ( i = 0; i < lb; ++i)
	{
		for ( j = 0; j < cb; ++j)
		{
			printf("Digite B[%d][%d]\n", i+1, j+1);
			scanf("%f", &b[i][j]);
		}
	}

	printf("A + B\n");
	for ( k = 0; k < ca; ++k)
	{
		for ( l = 0; l < la; ++l)
		{
			c[k][l] = a[k][l]+b[k][l];
			printf("%.2f \t", c[k][l]);
		}
		printf("\n");
	}

	printf("A - B\n");
	for ( k = 0; k < ca; ++k)
	{
		for ( l = 0; l < la; ++l)
		{
			c[k][l] = a[k][l]-b[k][l];
			printf("%.2f \t", c[k][l]);
		}
		printf("\n");
	}

	for ( i = 0; i < la; ++i)
	{
		free(a[i]);
		free(c[i]);
	}

	for ( i = 0; i < lb; ++i)
	{
		free(c[i]);
	}

	free(a);
	free(b);
	free(c);

	return 0;
}
