#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main (void)
{
	int i, j, supp;
	char str[50];

	printf("\nEntre com uma frase: ");
	gets(str);
	
	j = strlen(str);
	for(i = 0; i < j; i++)
	{
		supp = str[i];
		str[i] = str[j - 1];
		str[j - 1] = supp;
		j--;
	}

	puts(str);

return 0;
}
