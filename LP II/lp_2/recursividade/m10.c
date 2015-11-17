#include <stdlib.h>
#include <stdio.h>

int soma_dig(int);

int main(int argc, char const *argv[])
{
  int n;

  printf("Entre com o numero inteiro a ter os dígitos somados: \n");
  scanf("%d",&n);

  printf("Resultado: %d\n", soma_dig(n));

  return 0;
}

int soma_dig(int n)
{
  int sum = 0;

  if (n == 0)
    return 0;

  else
    sum += n % 10;
    return sum + soma_dig(n / 10);
}
