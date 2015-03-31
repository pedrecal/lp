#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main ()
{
	char str[50];
	int i = 0 ;

	printf("\nEntre com uma frase: ");
	gets(str);

	while(str[i] !='\0')
	{
		if (str[i] != ' ')
		{
			putchar (str [i]);
		}
		else
		{
			putchar('\n');
		}
	i++;
	}
	putchar('\n');
return 42;
}
