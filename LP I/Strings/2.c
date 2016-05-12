#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int main ()
{
	int i = 0;
	char str1[50];

	printf("Digite uma frase: ");
	gets(str1);

	while(str1[i] != '\0')
		printf("%c\n", str1[i++]);

return 0;
}
