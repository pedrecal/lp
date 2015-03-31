#include <stdio.h>
#include <stdlib.h>
int main()
{
	char str[100], *ptr;
	int a=0,e=0,i=0,o=0,u=0;
	ptr = &str[0];
	printf("Informe uma string: ");
	gets(str);
	while(*ptr!='\0')
	{
		if(*ptr=='a'||*ptr=='A')
			a++;
		if(*ptr=='e'||*ptr=='E')
			e++;
		if(*ptr=='i'||*ptr=='I')
			i++;
		if(*ptr=='o'||*ptr=='O')
			o++;
		if(*ptr=='u'||*ptr=='U')
			u++;
		ptr++;
	}
	printf("a ");
	while(a>0)
	{
		printf("*");
		a--;
	}
	printf("\ne ");
	while(e>0)
	{
		printf("*");
		e--;
	}
	printf("\ni ");
	while(i>0)
	{
		printf("*");
		i--;
	}
	printf("\no ");
	while(o>0)
	{
		printf("*");
		o--;
	}
	printf("\nu ");
	while(u>0)
	{
		printf("*");
		u--;
	}
	printf("\n");
	return 0;
}
