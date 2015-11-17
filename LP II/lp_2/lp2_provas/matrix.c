#include <stdlib.h>
#include <stdio.h>

int main()
{
    int n, **mat, i, j, *max, *min;

    printf("Entre com a ordem da matriz: \n");
    scanf("%d", &n);

    mat = malloc (n * sizeof(int *));
    if(mat == NULL)
        exit(1);

    for(i = 0; i < n; i++)
    {
        mat[i] = malloc (n * sizeof(int));
        if(mat[i] == NULL)
        {
            exit (1);
        }
    }

    max = &mat[0][0];
    min = &mat[0][0];

    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            printf("Entre com o elemento [%d][%d]\n",i, j);
            scanf("%d", &mat[i][j]);

            if(*max < mat[i][j])
                max = &mat[i][j];
            else if(*min > mat[i][j])
                min = &mat[i][j];
        }
    }

    printf("Max: %d\n", *max);
    printf("Min: %d\n", *min);
    return 0;
}
