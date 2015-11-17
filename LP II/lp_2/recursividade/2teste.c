#include <stdlib.h>
#include <stdio.h>

int Digitos(int);

int main(int argc, char const *argv[])
{
  int N;

  scanf("%d", &N);

  printf("%d\n", Digitos(N));

  return 0;
}

int Digitos(int N)
{
  int cont = 1;

  while (abs(N) > 9)
  {
    N /= 10;
    cont ++;
  }

  return cont;
}

//conta os dígitos
