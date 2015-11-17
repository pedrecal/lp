#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int strlen_rec(char, int);

int main(int argc, char const *argv[]) {
  char str[100];

  printf("Entre com string a ser medida: \n");
  gets(str);

  printf("O comprimento da string: %d \n",strlen_rec(str));
  return 0;
}

int strlen_rec (char *str, int i)
{
  if(str[i] == '\0')
    return 0;
  else
    return 1+ strlen_rec(str, i + 1);
}
