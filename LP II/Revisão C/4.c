#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    char cc[9];
    char sc[20];
    char vtd[20];
    char vtr[20];

    printf("Entre com o numer da conta corrente\n");
    gets(cc);
    printf("Entre com o saldo da conta\n");
    gets(sc);
    printf("Entre com o valor total depositado\n");
    gets(vtd);
    printf("Entre com o valor total retirado\n");
    gets(vtr);

    return 0;
}