#include <stdio.h>
#include <stdlib.h>

int soma(int);

int main(int argc, char const *argv[])
{
  int n;

  scanf("%d", &n);

  printf("%d\n", soma(n));
  return 0;
}

int soma (int n)
{
  if(n == 1)
    return 2;
  else
    return((1 + (n * n)) /n)  + soma (n - 1) ;
}
