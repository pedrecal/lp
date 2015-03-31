#include <stdlib.h>
#include <stdio.h>

int main()
{
    char team;
    int d, e, v;

    printf("Entre com o nome da equipe: \n");
    scanf("%c", &team);

    printf("Entre com o total de Derrotas, Empates e Vitorias\n");
    scanf("%d", &d);
    scanf("%d", &e);
    scanf("%d", &v);

    printf("A equipe teve %d pontos perdidos\n", d*3);
    printf("A equipe teve %d pontos ganhos\n", v*3);
    printf("A equipe teve o total de pontos de %d\n", v*3 - d*3);
    return 0;
}