#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int i;
    float notas, media;

        for(i = 0; i < 3; i++)
        {
            printf("Entre com a nota %d \n", i+1);
            scanf("%f", &notas);
            media +=notas;
        }

        printf("A sua media eh: %.2f \n\n", media/i );

        return 0;
}