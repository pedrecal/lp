#include "stdlib.h"
#include "stdio.h"

int fatorial_rec(int);

int main(int argc, char const *argv[]) {

  int num;

  printf("Entre com o numero fatorial: \n");
  scanf("%d", &num);

  printf("%d\n", fatorial_rec(num));

  return 0;
}

int fatorial_rec(int n)
{
  if (n == 0)
    return 1;
  else
    return n * fatorial_rec(n-1);
}
