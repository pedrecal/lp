#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[])
{
	int n, *v, *max, *min, i;

	printf("Entre com a quantia de elementos: \n");
	scanf("%d", &n);

	max = malloc(sizeof(int));
	min = malloc(sizeof(int));
	v = malloc(n * sizeof(int));

	if (v == NULL || max == NULL || min == NULL)
	{
		printf("Error!\n");
		return 0;
	}

	max = v;
	min = v;

	for (i = 0; i < n; ++i)
	{
		printf("Entre com o elemento %d\n", i+1);
		scanf("%d", &v[i]);

		if (v[i] > *max)
		{
			max = &v[i];
		}
		else if (v[i] < *min)
		{
			min = &v[i];
		}
	}


	printf("O maior elemento eh: %d O menor eh: %d \n",*max, *min);


	return 0;
}