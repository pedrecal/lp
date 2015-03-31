#include <stdio.h>
#include <stdlib.h>

int main()
{
    char name[30];
    int tel[9];

    printf("Digite seu nome\n");
    gets(name);
    printf("Digite seu telefone\n");
    gets(tel);

    printf("\n");
    puts(name);
    puts(tel);

    return 0;
}