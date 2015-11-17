#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[]) {

  float a;
  float *ptra;

  printf("Enter the float value: \n");
  scanf("%f", &a);

  ptra = &a;

  printf("Value(a): %f\n", a);
  printf("Direct adress(&a): %p\n", &a);
  printf("Pointer value(ptra): %p\n", ptra);
  printf("Pointer adress(*ptra): %f\n", *ptra);

  return 0;
}
