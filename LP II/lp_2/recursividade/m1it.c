#include "stdlib.h"
#include "stdio.h"

int main(int argc, char const *argv[])
{
  int i, n, m;

  printf("Entre com o valor a ser calculado: \n");
  scanf("%d", &n);

  for (i = n; i != 0; i--)
  {
    m = n + (n - 1);
  }

  printf("%d\n", n);

  return 0;
}
