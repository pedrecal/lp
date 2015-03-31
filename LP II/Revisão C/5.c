#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    float r;

    printf("Entre com o raio da circunferencia: \n");
    scanf("%f", &r);

    printf("O diametro da circunferencia eh de %.2f\n", r*2);
    printf("O valor da circunferencia eh de %.2f\n", 2*3.14*r);
    printf("A area da circunferencia eh de %.2f\n", 3.14*r*r);
    return 0;
}