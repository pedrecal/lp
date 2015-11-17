#include <stdio.h>
#include <stdlib.h>

int main()
{
FILE* myfile = fopen("vetor.txt", "r");
int ch, number_of_lines = 0;

do
{
    ch = fgetc(myfile);
    if(ch == '\n')
    	number_of_lines++;
} while (ch != EOF);

// last line doesn't end with a new line!
// but there has to be a line at least before the last line
if(ch != '\n' && number_of_lines != 0)
    number_of_lines++;

fclose(myfile);

printf("number of lines in test.txt = %d", number_of_lines);

return 0;
}
