#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[])
{
	char str[155], sub[155], *p, *p2;
	int len1, len2, count = 0, i = 0;

	printf("Entre com a frase: \n");
	gets(str);
	printf("Digite a sub string: \n");
	gets(sub);

	len1 = strlen(str);
	len2 = strlen(sub);

	if (len1 > len2)
	{
		while(i < len2)
		{
			if (/* condition */)
			{
				/* code */
			}
		}
	}

	printf("Ocorrencias: %d\n", count);
	return 0;
}