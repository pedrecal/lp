#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main (void)
{
	int i = 0, p;
	char str[50];

	printf("\nEntre com uma frase: ");
	gets(str);

	printf("Entre com o parametro 1: ");
	scanf("%i", &p);

	if(p == 1)
	{
		for(i = 0; i < strlen(str); i++)
		{
			putchar(toupper(str[i]));
		}
		
	}
	
	else
	puts (str);

return 0;
}
