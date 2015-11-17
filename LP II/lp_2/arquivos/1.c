#include <stdlib.h>
#include <stdio.h>

int main ()
{
  FILE *fp;
  int *vet, *max, *min, ch, j, cont = 0;
  int i = 0;

  if((fp = fopen("vetor.txt", "r")) == NULL)
  {
    printf("Erro ao abrir o arquivo!!!\n");
    return 0;
  }

  while(!feof(fp))
  {
    ch = fgetc(fp);
    if(ch == '\n') // '' != ""
      i++;
  }
  i--;
  rewind(fp);

  vet = malloc(i * sizeof(int));
  max = &vet[0];
  min = &vet[0];

  for(j = 0; j < i; j++)
  {
    fscanf(fp, "%d", &vet[j]);
    cont += vet[j];
  }

  for(j = 0; j < i; j++)
  {
    if (*max < vet[j])
      max = &vet[j];
    if (*min > vet[j])
      min = &vet[j];
  }

  printf("Media: %d\n", cont / i);
  printf("Maior: %d\n", *max);
  printf("Menor: %d\n", *min);

  fclose(fp);
  return 0;
}
