#include <stdio.h>
#include <stdlib.h>

int main()
{
    float s, p;
    int m;

    printf("Entre com o saldo do inicio do periodo: \n");
    scanf("%f", &s);

    printf("Entre com a quantia de meses: \n");
    scanf("%d", &m);

    printf("Entre com o percentual de rendimento do mês: \n");
    scanf("%f", &p);

        for(;m > 0; m--)
        {
            s += s * p/100;
        }

    printf("O seu saldo este mes eh de: %.2f\n", s);
    return 0;
}