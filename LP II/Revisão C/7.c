#include <stdlib.h>
#include <stdio.h>

int main()
{
    char nome[25], s[0], si[0], q, M, A;
    int m=0, f=0, a=0, r=0, t=0;

            printf("Entre com o nome do aluno (Digite 'q' quando desejar encerrar): \n");
            gets(nome);

        while((nome[0] != 'q') && nome[1] != '\0')
        {


            t++;
            printf("Entre com o sexo do aluno, M para Masculino e F para Feminino: \n");
            gets(s);

                if(s[0] == 'M')
                {
                    m++;
                }
                else
                {
                    f++;
                }

            printf("Entre com a situação do aluno, A para Aprovado e R para Reprovado: \n");
            gets(si);

                if(si[0] == 'A')
                {
                    a++;
                }
                else
                {
                    r++;
                }

                printf("Entre com o nome do aluno (Digite 'q' quando desejar encerrar): \n");
                gets(nome);
        }

        printf("A porcentagem de alunos do sexo Masculino eh de: %%%d\n", (100*m)/t);
        printf("A porcentagem de alunos do sexo Feminino eh de: %%%d\n", (100*f)/t);
        printf("A porcentagem de alunos Reprovados eh de: %%%d\n", (100*r)/t);
    return 0;
}