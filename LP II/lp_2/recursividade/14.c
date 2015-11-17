#include <stdio.h>
#include <stdlib.h>

void div (int);

int main(int argc, char const *argv[]) {
  int n;

  scanf("%d\n", &n);
  printf("%d", div(n));
  return 0;
}
