#include <stdlib.h>
#include <stdio.h>

float pot_rec(float, float);

int main(int argc, char const *argv[])
{
  int b, e;

  printf("Entre com a base e a potencia: \n");
  scanf("%d", &b);
  scanf("%d", &e);

  printf("%f\n", pot_rec(b, e));
  return 0;
}

float pot_rec(float b, float e)
{
  if(e == 0)
    return 1;
  if(e > 0)
    return b * pot_rec(b, e - 1);
  if(e < 0)
    return (1 / pot_rec(b, -e));


    return 0;
}
