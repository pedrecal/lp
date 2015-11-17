#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]) {

    FILE *fp;
    float *v;
    int n, i;

    fp = fopen("Vetorbin.dat", "rb");
    if (fp == NULL)
        exit(-1);
    fread(&n, sizeof(int), 1, fp);
    v = malloc(n * sizeof(float));
    if(v == NULL)
        exit(-1);
    fread(v, sizeof(int), n, fp);
    for(i = 0; i < n; i++)
        printf("%.2f\n", v[i]);
    fclose(fp);
    free(v);
    return 0;
}
