#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, **mat, *min, *max, i, j;

    printf("Ordem da mat:\n");
    scanf("%d", &n);

    mat = malloc(n * sizeof(int *)); //Aloca
    if(mat == NULL)
        exit(1);

    for(i = 0; i < n; i++)
    {
        mat[i] = malloc(n * sizeof(int));//Aloca cada elemento
        if(mat[i] == NULL)
            exit(1);
    }

    max = &mat[0][0];//Inicia max e min no endereço
    min = &mat[0][0];

    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            printf("mat[%d][%d]\n",i, j);
            scanf("%d", &mat[i][j]);//Vai botando os elementos

            if(*max < mat[i][j])//Ja vai comparando o que tá no endereço com o elemento reccem entrado
                max = &mat[i][j];
            else if(*min > mat[i][j])
                min = &mat[i][j];
        }
    }

    printf("Maior %d, Menor %d\n", *max, *min);

    for(i = 0; i < n; i++)
    {
        free(mat[i]);
    }
    free(mat);
    return 0;
}
