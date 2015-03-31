#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int a = 1, b = 4, c = 54, i;
	int *ptr;
	char d ='a';

	for(i = 0; i < 3; i++)
	{
		ptr = &'a';
		printf("%p\n", *ptr);
		d++;
	}
	return 0;
}