#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main (void)
{
	int i = 0;
	char str[50];

	printf("\nEntre com algo a ser convertido para ASCII: ");
	gets(str);

	while(str[i] !='\0')
		printf("%d\n", str[i++]);

return 0;
}
