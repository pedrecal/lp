#include <stdio.h>
#include <stdlib.h>

int main()
{

	char str[100], *ptr;
	int i;

	printf("Entre com a string: \n");
	gets(str);

	ptr = &str[0];

	while(*ptr != '\0')
	{
		i++;
		ptr++;
	}

	printf("A string contem %d elementos\n", i);

	
	return 0;
}