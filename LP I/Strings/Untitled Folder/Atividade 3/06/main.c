#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i;
    char frase[50];

    printf("Digite uma frase: ");
    gets(frase);

    printf("\n");

    for(i=0;i<strlen(frase);i++){
        if(isspace(frase[i]))
            printf("\n");
        else
            printf("%c", frase[i]);
    }

    return 0;
}
