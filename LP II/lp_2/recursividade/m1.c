#include "stdlib.h"
#include "stdio.h"

int soma(int);

int main(int argc, char const *argv[]) {

  int num;

  printf("Entre com o numero a ser somado de 0 a ele: \n");
  scanf("%d", &num);

  printf("%d\n", soma(num));

  return 0;
}

int soma(int n)
{
  if (n == 0)
    return 0;
  else
    return n + soma(n-1);
}
