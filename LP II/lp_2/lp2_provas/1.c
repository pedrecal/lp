#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m[100], n[100], sm, sn, i, j;

    printf("Digite o tamanho do primeiro vetor:\n");
    scanf("%d", &sm);
    printf("Digite o tamanho do segundo vetor:\n");
    scanf("%d", &sn);

    for(i = 0; i < sm; i++)
    {
        printf("Entre com o elemento %d do primeiro vetor:\n", i);
        scanf("%d", &m[i]);
    }
    for(j = 0; j < sn; j++)
    {
        printf("Entre com o elemento %d do segundo vetor:\n", j);
        scanf("%d", &n[j]);
    }

    printf("Elementos diferentes: \n");

    for(i = 0; i < sm; i++)
    {
        for(j = 0; j < sn; j++)
        {
            if(m[i] != n[j])
            {
                printf("%d  ", m[i]);
            }
        }
    }
    return 0;
}
