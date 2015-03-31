#include <stdlib.h>
#include <stdio.h>

int main()
{
    int m, i, c;
    float tm, ti, tc, t;

    printf("Entre com a quantia de Mochilas vendidas no dia: \n");
    scanf("%d", &m);

    printf("Entre com a quantia de Isqueiros vendidos no dia: \n");
    scanf("%d", &i);

    printf("Entre com a quantia de Chinelos vendidos no dia: \n");
    scanf("%d", &c);

    tm = m*25.00;
    printf("Neste dia o faturamento por venda de Mochilas foi de: R$%.2f\n", tm);
    ti = i*2.00;
    printf("Neste dia o faturamento por venda de Isqueiros foi de: R$%.2f\n", ti);
    tc = c*7.00;
    printf("Neste dia o faturamento por venda de Chinelos foi de: R$%.2f\n", tc);

    t = tm + ti + tc;
    printf("O faturamento total neste dia foi de: %.2f\n", t);
    return 0;
}