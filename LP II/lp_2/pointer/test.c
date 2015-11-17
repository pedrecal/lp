#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
  int i;
  char *naipe[4] = {"copas", "ouros",
  "paus", "espadas"}, *Ptr;
  for(i=0;i<4;i++)
  {
    Ptr = naipe[i];
    while(*Ptr)
    {
      putchar(*Ptr);
      Ptr++;
    }
    printf("\n");
  }
return 0;
}
