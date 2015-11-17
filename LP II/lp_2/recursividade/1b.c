#include "stdlib.h"
#include "stdio.h"

int main(int argc, char const *argv[])
{
  int i, n;

  printf("Entre com o valor a ser calculado o fatoria: \n");
  scanf("%d", &n);

  for (i = 0; i < n; i++)
  {
    i *= n;
  }

  printf("Fatorial de %d eh %d\n", n, i);

  return 0;
}
