#include <stdlib.h>
#include <stdio.h>

int main()
{
    int m, n, *a, *b, i, j, flag;
    printf("Digite a quantidade de elementos de a:");
scanf("%d", &m);
printf("Digite a quantidade de elementos de b:");
scanf("%d", &n);
a = malloc(m*sizeof(int));
b = malloc(n*sizeof(int));
if(a==NULL||b==NULL){
printf("Estouro de memoria!!!\n");
return -1;
}
for(i=0;i<m;i++){
printf("Digite o elemento a[%d]:", i);
scanf("%d", &a[i]);
}
for(i=0;i<n;i++){
printf("Digite o elemento b[%d]:", i);
scanf("%d", &b[i]);
}
printf("Resultados\n");
for(i=0;i<m;i++){
flag = 1;
for(j=0;j<n && flag;j++)
if (a[i]==b[j]){
flag = 0;
}
if (flag==1)
printf("%d ", a[i]);
}
printf("\n");
free(a);
free(b);
return 0;
}
