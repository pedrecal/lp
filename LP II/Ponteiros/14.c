#include <stdio.h>
#include <stdlib.h>

int main()
{

	char str[100], *ptr, c;
	int i;

	printf("Entre com a string: \n");
	gets(str);

	printf("Entre com um character a ser contado\n");
	scanf("%c", &c);

	ptr = &str[0];

	while(*ptr != '\0')
	{
		if(*ptr == c)
		{
			i++;
		}
		ptr++;
	}

	printf("A string contem '%c' %d vezes\n", c, i);

	
	return 0;
}