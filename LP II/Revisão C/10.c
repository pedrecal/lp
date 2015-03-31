#include <stdlib.h>
#include <stdio.h>

int main()
{
    int s, hh, mm, ss;

    printf("Entre com o horario do dia em segundos: \n");
    scanf("%d", &s);

    if(s < 0 || s > 86400 )
    {
        printf("Quantia invalida, reinicie o programa!\n");
    }
    else
    {
        ss = s%60;
        s -= ss;
        mm = ss%60;
        s -= mm;
        hh = s%60;
        s -= hh;

        printf("%d:%d:%d e %d\n", hh, mm, ss, s);
    }
    return 0;
}