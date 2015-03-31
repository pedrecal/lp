#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
	char str[100], *ptr;
	int d = 0, v = 0, s = 0;

	printf("Entre com a string:\n");
	gets(str);

	ptr = &str[0];

	while(*ptr != '\0')
	{

		if(*ptr=='a'||*ptr=='A'||*ptr=='e'||*ptr=='E'||*ptr=='i'||*ptr=='I'||*ptr=='o'||*ptr=='O'||*ptr=='u'||*ptr=='U')
		{
			v++;
		}
		if(isspace(*ptr))
		{
			s++;
		}
		if(*ptr != ' ')
		{
			d++;
		}
		ptr++;
	}

	printf("A string contém %d vogais, %d digitos e %d caracteres em branco\n", v, d, s);
	return 0;
}