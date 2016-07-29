
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        char sair = 'n';
        char informacao = 'n';
        Scanner sc = new Scanner(System.in); //abre para leitura

        FonteDeExpressoes expressoes = new FonteDeExpressoes(); //ler do arquivo
        ArrayList<Expressao> listExp = expressoes.GetVet(); //lista de expressoes salvas na memoria ok
        Expressao exp; //vai receber as questoes de listExp

        MotorDoJogo ref; //instancia de motor do jogo solicitada
        BaseMotorDoJogo motor = new BaseMotorDoJogo(); //solicitacao de motor do jogo da clase base motor do jogo

        System.out.println("Bem vindo ao Jogo das operacões matemáticas!!!!");
        System.out.println("É bastante simples jogar!!! Dada uma expressão matemática ao jogador, ele precisa tentar adivinhar a resposta correta.");
        System.out.println("Utilise a linha de comando, as respostas pode conter valores decimais, favor utilize a virgula como divisor de casas.\n");
        System.out.println("Jogo desenvolvido por Eberty Alves\n\n");

        do {
            Jogador jog = new Jogador(); //jogador do jogo
            System.out.println("Escolha um modo de jogo: ");
            System.out.println("1 - Modo Rapido");
            System.out.println("2 - Modo treino");
            System.out.println("3 - Modo Campanha");
            System.out.print("Você escolheu: ");
            do {
                jog.modoJogo = sc.nextInt();
            } while (jog.modoJogo < 1 || jog.modoJogo > 3);

            ref = motor.getMotorDoJogo(jog);

            System.out.print("\n");
            
            if (jog.modoJogo == 2 || jog.modoJogo == 3){ //quantos erros pode ter
                System.out.print("Escolha a quantidade de erros pode cometer: ");
                do {
                    jog.qPodeErrar = sc.nextInt();
                } while (jog.qPodeErrar < 0);
            }
             if (jog.modoJogo == 2){ //jogo com fases para o treino
                 System.out.print("Você escolheu o modo treino, aqui voce escolhe!!! Deseja um jogo de fazes?[s/n] ");
                char fase = 'a';
                do {
                    fase = sc.next().charAt(0);
                } while (fase != 's' && fase != 'n');
                if (fase == 's')
                    jog.setJogoComFases(true);
                else
                    jog.setJogoComFases(false);
            }
            
             System.out.print("");
             
            if (jog.modoJogo != 3) {
                System.out.println("\nEscolha um Dificultador: ");
                System.out.println("1 - Aleatorio");
                System.out.println("2 - Nivel");
                System.out.println("3 - Tipo");
                System.out.println("4 - Nivel e Tipo");
                System.out.print("Você escolheu: ");
                do {
                    jog.escolheDif = sc.nextInt();
                } while (jog.escolheDif < 1 || jog.escolheDif > 4);

                if (jog.escolheDif == 2 || jog.escolheDif == 4) {
                    System.out.print("\nDigite o nível das questões: ");
                    jog.nivelAtual = sc.nextInt();
                }

                if (jog.escolheDif == 3 || jog.escolheDif == 4) {
                    System.out.print("\nDigite o tipo de operacao das questões: ");
                    do {
                        jog.oper = sc.next().charAt(0);
                    } while (jog.oper!= 's' && jog.oper!= 'd' && jog.oper!= 'a' && jog.oper!= 'm');
                }
                
                System.out.print("\nDeseja ver alguma informação antes de responder?[s/n] ");
                do {
                    informacao = sc.next().charAt(0);
                } while (informacao != 's' && informacao != 'n'); //verificar se digitou correto
                
                System.out.println("\nO jogo está prestes a começar");
                System.out.println("O modo rapido aceita ate 20 questoes, acima disso o valor eh definido como 20");
                System.out.println("O modo treino aceita quantas questoes o usuario digitar");
                System.out.println("Valores negativos sao considerados como 0 questoes");
                System.out.print("Digite a quantidade de questões: ");
                ref.setqQuest(sc.nextInt());
            } else {
                jog.escolheDif = 2;
                jog.nivelAtual = 1;
                System.out.println("Modo campanha sao 5 niveis de 12 questoes aleatorias cada, totalizando 60 questoes");
                ref.setqQuest(sc.nextInt());
            }


            while (!ref.jogoAcabou(jog)) {
                exp = ref.solicitarDif(jog).getExpressao(listExp);
                
                System.out.println("\n" + ref.solicitarDif(jog).retornaInfo(exp, informacao)); //informacao q escolhoi receber ou nao
                System.out.print(exp.exibirExpressao());
                
                jog.setResp(sc.nextDouble());

                if (ref.acertou(exp, jog)) {
                    System.out.println("O jogador acertou!");
                } else {
                    System.out.println("O jogador errou!");
                    //deseja repetir? //corrigir, nao pode fazer o repete e contar como 2 questoes
                    
                }
                
                //if (ref.jogoDeFases(jog)){
                    //modo teino perguntar se pode passar de fase
                    //modo campanha
                //}
                    
                    
                System.out.print("Digite -1 para acabar com o jogo atual, digite qualquer outro valor inteiro para continuar jogando: ");
                int conti = sc.nextInt();
                if (conti == -1)
                    jog.setContinua(false);
            }
            
            //apresentar dados do jogador
            System.out.println("\nO jogador terminou o atual jogo com " + jog.getqQuestResp() + " questões respondidas, de um total de " + ref.getqQuest() + " questões");
            System.out.println("A quantidade de erros desse jogador foi: " + jog.getErros());
            System.out.println("O jogador conseguiu " + jog.getPontos() + " pontos");
            double calculo = ((jog.getqQuestResp() - jog.getErros()) / (double)ref.getqQuest()) * 100.0;
            System.out.println("Com um total de " + jog.getPontos() + " pontos, o percentual de acerto em relacão ao numero de questoes disponiveis foi de: " + calculo + "%");
            
            System.out.print("\nDeseja sair do jogo?[s/n] ");
            do {
                sair = sc.next().charAt(0);
            } while (sair != 's' && sair != 'n'); //verificar se digitou correto
            
            System.out.print("\n\n");
            
        } while (sair == 'n');

        sc.close();
    }
}
