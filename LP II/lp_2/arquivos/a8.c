#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    float *v;
    int i, n;
    FILE *fp;
    printf("Informe o tamanho do vetor: " );
    scanf("%d", &n);
    if(n <= 0)
        exit(-1);
    v = malloc(n * sizeof(float));
    if(v == NULL)
        exit(-1);
    for(i = 0; i < n; i++)
    {
        printf("Informe o elemento[%d]: ", i);
        scanf("%f", &v[i]);
    }
    fp = fopen("Vetorbin.dat", "wb");
    if(fp == NULL)
        exit(-1);

    fwrite(&n, sizeof(int), 1, fp);
    fwrite(v, sizeof(float), n, fp);

    fclose(fp);
    free(v);
    printf("Programa Finalizado\n" );

    return 0;
}
