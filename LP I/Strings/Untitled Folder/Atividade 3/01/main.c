#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i, x;
    char nome[50], trd;

    printf("Escreva o seu nome: ");
    gets(nome);

    printf("\nO nome digitado: ");
    puts(nome);

    for(i=0;i<strlen(nome);i++){
        printf("\n%c", nome[i]);
    }
    printf("\n");
    system("pause");
    system("cls");

    printf("O codigo ascii dos caracteres digitados: \n");
    for(i=0;i<strlen(nome);i++){
        printf("\n%c==%d", nome[i], nome[i]);
    }
    printf("\n");
    system("pause");
    system("cls");

    i=0;
    printf("Digite (1) para transformar o nome em maiusculo: ");
    scanf("%d", &i);

    printf("\n");

    if(i==1){
            for(x=0;x<strlen(nome);x++)
                putchar(toupper(nome[x]));
    }
    printf("\n");
    system("pause");
    system("cls");

    printf("O nome escrito ao contrario:\n");

    x=0;
    x=strlen(nome);
    for(i=0;i<x;i++){
        trd=nome[i];
        nome[i]=nome[x-1];
        nome[x-1]=trd;
        x--;
    }

    printf("\n");
    puts(nome);

    printf("\n");
    return 0;
}
