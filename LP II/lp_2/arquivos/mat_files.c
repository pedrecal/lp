#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int** mat_aloc (int);
void mat_free (int**, int);
void mat_gen (int**, int);
void mat_rec (int**, int);

int main(int argc, char const *argv[])
{
  int n, **mat;

  printf("Digite a dimensao da matriz: \n");
  scanf("%d", &n);

  mat = mat_aloc(n);
  srand(time(NULL));
  mat_gen(mat, n);
  mat_rec(mat, n);
  mat_free(mat, n);

  return 0;
}

void mat_gen(int **m, int d)
{
  int i, j;

  for(i = 0; i < d; i++)
  {
    for(j = 0; j < d; j++)
    {
      m[i][j] = rand();
    }
  }
}

void mat_rec(int **m, int d)
{
  int i, j;
  FILE *fp;

  if((fp = fopen("matrix.txt", "w")) == NULL)
  {
    printf("Erro ao criar arquivo\n");
    exit(1);
  }

  fprintf(fp, "%d\n", d);
  for(i = 0; i < d; i++)
  {
    for(j = 0; j < d; j++)
    {
      fprintf(fp, "%7d ", m[i][j]);
    }
    fprintf(fp, "\n");
  }

  fclose(fp);
}

int** mat_aloc(const int d)
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

void mat_free(int **m, const int l)
{
    int i;

    for(i=0;i<l;i++)
    {
      free(m[i]);
    }
    free(m);
}
