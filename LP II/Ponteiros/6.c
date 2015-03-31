#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int i, j;
	float *n1, *n2, *m, m1, m2;

	printf("Entre com a quantia de alunos: \n");
	scanf("%d", &j);

	n1 = malloc(j * sizeof(float));
	n2 = malloc(j * sizeof(float));
	m = malloc(j * sizeof(float));

	if (n1 == NULL || n2 == NULL || m == NULL)
	{
		printf("ERROR!\n");
		return -1;
	}

	for (i = 0; i < j; ++i)
	{
		printf("Entre com as notas do aluno %d \n", i +1);
		scanf("%f %f", &n1[i], &n2[i]);
		m[i] = (n1[i] + n2[i]) / 2;
		m1 += n1[i];
		m2 += n2[i];
	}

	for (i = 0; i < j; ++i)
	{
		printf("O aluno %d teve media %.1f	",i +1, m[i]);
		if (m[i] < 7)
		{
			printf("Reprovado\n");
		}
		else
		{
			printf("Aprovado\n");
		}
	}

	printf("A media da turma na primeira prova foi de %.1f e na segunda %.1f\n",m1 / j, m2 / j);

	free(n1);
	free(n2);
	free(m);


	return 0;
}