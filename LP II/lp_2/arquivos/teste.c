#include <stdlib.h>
#include <stdio.h>

int main(int argc, char const *argv[])
{

  FILE *fp;

  if ((fp = fopen("teste.txt", "w") == NULL)
  {
    printf("Error, o fucking arquivo não funciona.\n");
    exit(1);
  }


  fclose(fp);




  return 0;
}
