#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	float Kms[10] = {240.5, 300.0, 189.6, 310.6, 280.7, 216.9, 199.4, 160.3, 177.4, 192.3};
	float Lts[10] = {10.3, 15.6, 8.7, 14, 16.3, 15.7, 14.9, 10.7, 8.3, 8.4};
	float KpL[10], *ptrv1, *ptrv2, *ptrv3;
	int i;

	ptrv1 = malloc(10 * sizeof(float));
	ptrv2 = malloc(10 * sizeof(float));
	ptrv3 = malloc(10 * sizeof(float));

	ptrv1 = Kms;
	ptrv2 = Lts;
	ptrv3 = KpL;

	if (ptrv1 == NULL || ptrv2 == NULL || ptrv3 == NULL)
	{
		printf("Error!! \n");
	}
	else
	{
		for (i = 0; i < 10; ++i)
		{
			*ptrv3 = *ptrv1 / *ptrv2;
			ptrv1++;
			ptrv2++;
			ptrv3++;
		}

		for (i = 0; i < 10; ++i)
		{
			printf("%f\n", KpL[i]);
		}
	
	}
	return 0;
}