#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[])
{
	char str[80], sub[3], *p;
	int count = 0;

	printf("Entre com a frase: \n");
	gets(str);
	printf("Digite a sub string: \n");
	gets(sub);

	p = str;
	while(*p != '\0')
	{
		if (*p == sub[0] && *(p+1) == sub[1])
		{
			count++;
			p++;
		}
		p++;
	}
	
	printf("Ocorrencias: %d\n", count);
	return 0;
}