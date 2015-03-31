#include <stdio.h>
#include <stdlib.h>

int main (void)
{
    float x;

    printf("Entre com um numero: ");
    scanf("%f",&x);
    printf("\n");

    printf("O dobro desse numero eh: %.2f\n",x*2 );
    printf("O triplo desse numero eh %.2f\n", x*3);
    printf("A metade desse numero eh %.2f\n",x/2 );
    printf("O triplo da metade desse numero eh %.2f\n\n", x/2*3);

    return 42;
}