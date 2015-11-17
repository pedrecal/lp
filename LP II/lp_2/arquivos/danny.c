#include <stdio.h>
#include <time.h>
//Funções auxiliares
int** aloca_matriz(int);
void libera_matriz(int **, int);
void gera_matriz(int **, int);
void grava_matriz(int **, int);
//Função main()

int main()
{
    int n, **mat;
    printf("Digite a dimensao da matriz: ");
    scanf("%d", &n);
    mat = aloca_matriz(n);

    srand(time(NULL));
    gera_matriz(mat, n);
    grava_matriz(mat, n);
    libera_matriz(mat, n);

    return 0;
}

void gera_matriz(int **m, int d)
{
    int i, j;
    for(i=0;i<d;i++)
        for(j=0;j<d;j++)
            m[i][j] = rand();
}

void grava_matriz(int **m, int d)
{
    int i, j;
    FILE *f;
    if ((f=fopen("mat.txt","w"))==NULL)
    {
        printf("Erro ao criar arquivo!!!\n");
        exit(1);
    }
    fprintf(f, "%d\n", d);
    for(i=0;i<d;i++)
    {
        for(j=0;j<d;j++)
            fprintf(f, "%7d ", m[i][j]);
        fprintf(f, "\n");
    }
    fclose(f);
}

int ** aloca_matriz(const int d)
{
    int **m;
    int i;
    m = (int **) malloc(d * sizeof(int *));
    if (m==NULL)
    {
        printf("Erro, estouro de memoria!!!\n");
        exit(1);
    }
    for(i=0; i<d; i++)
    {
            m[i] = (int *) malloc(d * sizeof(int));
            if (m[i]==NULL)
            {
                printf("Erro, estouro de memoria!!!\n");
                exit(1);
            }
    }
return m;
}

void libera_matriz(int **m, const int l)
{
    int i;
    for(i=0;i<l;i++)
        free(m[i]);
    free(m);
}
