
package lpiii.pkg2015.pkg2.pkg003;

import java.awt.Container; 
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LPIII20152003 extends JFrame implements ActionListener {
    /* Na linha acima a nossa classe está herdando de JFrame. Isso significa que ela
    também é um JFrame. Além disso, nossa classe JFrame implementa a interface 
    ActionListener, e isso significa que ela herda os métodos desta interface, 
    e constrói um corpo para cada método herdado. Perceba que uma interface 
    não pode ser instanciada diretamente, e isso significa que uma interface
    faz o papel de uma classe abstrata que contém apenas métodos, haja vista
    que interfaces não possuem atributos. Desta forma, temos na linha 13 um 
    exemplo de herança múltipla, pois nossa classe herda ao mesmo tempo de 
    JFrame e ActionListener. */

    private final JLabel prompt;
    /* Na linha 24 pronpt é uma variável do tipo JLabel. Esta classe é utlizada 
    para implementar textos estáticos em janelas, ou seja, textos que não podem
    ser modificados pelo usuário, mas apenas pelo próprio programa. 
    */
    
    JTextField input;
    /* Esta variável input é do tipo JTextField. Ela é utilizada para implementar
    em janelas o campo de entrada de textos. Desta forma, o usuário digita o texto
    neste campo na janela. */
    
    static JLabel r1 = new JLabel(" ");
    /* Está sendo instanciado um objeto da classe JLabel, ou seja, um obejto
    está sendo criado. Quando isso acontece, o objeto armazena todas as carac-
    terísticas que são comuns à sua classe, ou seja, todos os métodos e 
    atributos. O que muda em cada objeto são os valores dos atributos. Durante
    a criação o construtor é chamado. O construtor é um método cujo nome é 
    igual ao nome da classe. Perceba que em java não é comum que se implemente
    destrutores, pois java possui coletor de lixo, que é um sistema que perce-
    be quando um objeto não está mais sendo utilizado por ninguém, e libera
    a memória deste objeto. 
    */
    JLabel r2;
    /* Comentário análogo ao da linha 24. */
    
    public LPIII20152003(){
        super();
        /* super neste caso é um nome reservado, e aqui está sendo utilizado
        para chamar primeiro o construtor da classe mãe, para que só então
        o construtor desta classe seja executado. Isto é importante às vezes
        porque os métodos a seguir são da classe mãe, e por isso, caso o
        construtor da classe mãe não seja executado primeiro, então há a possi-
        bilidade de que estes métodos não possam ser chamados ou sejam chamados
        para um objeto vazio, o que causaria erro em tempo de execução. 
        */
        
        setSize(400, 100);
        /* Ajusta o tamanho da janela. Perceba que nós não implementamos este
        método. Porém, nossa classe herdou este método da classe JFrame. 
        Por isso, podemos usá-lo como se ele fosse um método de nossa classe. */
        setLocationRelativeTo(null);
        /* Outro exemplo de método herdado da classe JFrame. Neste caso, quando
        este método é invocado com parâmetro null, a janela é colocada
        no centro da tela. */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Neste caso, está sendo dito para nosso programa que ele deve ser 
        fechado, ou seja, encerrado, quanod o usuário clicar sobre o botão 
        fechar de nosso programa. Perceba que outras opções seriam possíveis, 
        tais como apenas mandar nosso programa ser minimizado ou simplesmente
        não fazer nada. */
        
        Container container = getContentPane();
        /* Neste caso, a variável container está armazenando um objeto 
        da classe Container. Perceba que não estamos criando o objeto, mas
        que ele já existia. Mas onde ele estava? Ele estava armazenado
        internamente na classe JFrame. Perceba que o método getContentPane()
        foi herdado da classe JFrame, e por isso nós estamos conseguindo 
        chamá-lo aqui. Uma outra forma de chamá-lo seria: this.getContentPane(),
        mas o this não é obrigatório. Qual é a função do container? Resposta:
        armazenar os objetos que são exibidos na parte da janela onde está
        o painel. Mas o que é painel? Painel é a área da janela menos a área
        da barra de títulos, ou seja, o lugar onde os objetos gráficos são
        exibidos. Mas porque este objeto está sendo necessário? Resposta: por
        causa do que vai acontecer na próxima linha. */
        container.setLayout(new FlowLayout());
        /* Nesta linha, ou seja, na linha 88, estamos dizendo para o painel
        que qual deve ser seu gerenciador de layout. Existem vários. Uma opção
        é o FlowLayout. O que ele faz? Ele organiza os objetos da esquerda para
        a direita na janela, à medida que os objetos são inseridos pelo progra-
        mador. Assim, não é necessário ao programador dizer qual é a posição do
        objeto na janela, mas apenas inserir o objeto no painel, e o gerenciador
        de layout se encarrega de dizer onde será sua posição, automaticamente. 
        Perceba que neste caso criamos um novo objeto desta classe FlowLayout. 
        Este é mais um exemplo de instanciação. */
        
        prompt = new JLabel("Entre com o raio: ");
        /* O mesmo comentário da linha 24. Porém, neste caso o objeto está sendo
        criado. Na linha 24 a única coisa que havia sido feita era a declara-
        ção da variável, mas sem a criação do objeto. Perceba que esta é 
        uma operação típicamente implementada dentro de métodos construtores, 
        como nós estamos fazendo agora. */ 
        r2 = new JLabel(" ");
        /* O mesmo comentário da linha 24 e da linha 99. */ 
        input = new JTextField(10);
        /* O mesmo comentário da linha 30 e da linha 99. */
        
        input.addActionListener(this);
        /* Esta é uma linha interessante. Neste caso, a variável input armazena
        um objeto da classe JTextField. Objetos dessa classe são capazes
        de ouvir eventos vindos do usuário, tais como aqueles produzidos
        pela digitação de texto e pressionamento da tecla enter. Porém, estes
        eventos precisam ser tratados em algum lugar do nosso programa, e isto
        é feito através do método addActionListener. Perceba que como nossa
        classe implementa a interface ActionListener, então ela também herda de
        ActionListener, e por isso ela também é um ActionListener. Por isso, 
        podemos passar o nosso próprio programa como parâmetro para este método, 
        pois nosso programa é um objeto de nosso classe, que por sua vez herda
        de ActionListener. É isto que está sendo feito com a palavra this. */
        container.add(prompt);
        /* Veja os comentários da linha 88 e 75. Perceba que apenas 
        estamos inserindo os objetos, mas que não é necessário dizer qual é
        a posição deles. */
        container.add(input);
        /* Veja os comentários da linha 88 e 75. Perceba que apenas 
        estamos inserindo os objetos, mas que não é necessário dizer qual é
        a posição deles. */
        container.add(r1);
        /* Veja os comentários da linha 88 e 75. Perceba que apenas 
        estamos inserindo os objetos, mas que não é necessário dizer qual é
        a posição deles. */
        container.add(r2);
        /* Veja os comentários da linha 88 e 75. Perceba que apenas 
        estamos inserindo os objetos, mas que não é necessário dizer qual é
        a posição deles. */
        
    }
    
    public static void main(String[] args) {
        
        try{
            /* Na linha acima, ou seja, na linha 143, usa-se o comando try-catch. 
            O que este comando faz? Para quê ele serve? Resposta: este é um 
            comando de tratamento de erros. Basicamente, estamos dizendo
            para o programa tentar executar o código que está dentro do bloco
            try. Caso ele consiga, então o processamento será análogo ao 
            processamento que estamos acostumados a ver sem o bloco try. Porém,
            caso ocorra algum erro de execução dentro deste bloco, tal como
            aqueles que ocorrem com invasão de memória, então o processamento 
            será interrompido, e um objeto será lançado para o bloco catch, 
            onde o programa passará a executar o código. 
            Isto é feito para se aumentar
            a confiabilidade do programa e para se fazer o tratamento de erros. 
            */
            LPIII20152003 app = new LPIII20152003();
            /* Nossa aplicação também é um objeto. Por isso também precisa
            ser instanciada. */
        
            EventQueue.invokeLater(new Runnable() {
                /* Neste caso estamos inserindo na fila de eventos do sistema
                um novo evento, cujo processamento será feito pelo método run
                abaixo. Neste método run pede-se para que nossa aplicaçao
                torne-se visível na tela. Este método run será executado
                após todos os eventos de entrada do programa terem sido 
                processados, e isto faz com que alguns erros de tempo de execu-
                ção sejam eliminados. Sem isso, nossa aplicação não apareceria
                na tela se apenas executássemos o método setVisible(true) de
                fora do método run. */
            
            public void run() {
                app.setVisible(true);
  
            }
        });
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            /* Tipicamente, em blocos catch, pede-se para exibir uma 
            mensagem de erro explicando o que aconteceu. Perceba que aqui
            há aplicação do conceito de sobrecarga de métodos, de herança e de 
            programação genérica, haja vista que o método getMessage, 
            pertence a classe Exception e às suas subclasses. Assim, 
            tipicamente o objeto que está armazenado na variável e é um objeto 
            de uma classe que herda de Exception,
            e por isso o método getMessage() a ser chamado será o método 
            de uma de suas classes filhas. Perceba que a execução muda
            dependendo do objeto que está em 'e', mas que a chamada do método
            é a mesma. Isto é uma forma de programação genérica. */
        }
        
    }
    
    static private float calcula_valor(float valor){
        System.out.println("float...");
        /* A linha 196 chama um método estatico que mostra uma mensagem na 
        tela. */
        return (float) Math.pow(valor, 2.0);
        /* A linha 199 retorna um valor numérico. */
    }
    
    static private int calcula_valor(int valor){
        /* Perceba que este método possui o mesmo nome do método da linha 195,
        mas que o parâmetro muda. Isto é possível, pois java trabalha com 
        sobrecarga de métodos. Assim, o método a ser executado dependerá 
        do parâmetro que estiver sendo passado. */
        
        System.out.println("int...");
        return (int) Math.pow(valor, 3.0);
    }

    public void actionPerformed(ActionEvent e){
        /* Existem vários tipos de eventos. Um deles é o ActionEvent. 
        Assim, o objeto que está armazenado na variável 'e' também implementa
        método herdados, com os quais é possível implementar programação
        genérica, fazendo-se uso de herança e sobrecarga de métodos. 
        Neste caso, a programação genérica se dá pela chamada do método 
        getActionCommand(), cujo processamento depende do objeto que estiver
        armazenado na variável 'e', mas cuja chamada é exatamente a mesma
        independentemente de qual objeto está sendo chamado. */
        
        float valor = Float.parseFloat(e.getActionCommand());
        /* Neste caso, o método parseFloat é estático, ou seja, ele deve ser
        chamado pelo nome da classe Float, e não por uma variável que armazena
        um objeto desta classe, como ocorre com a variável 'e'. 
        O método getActionCommand retorna um texto. Assim, parseFloat faz o 
        processameto deste texto e o transforma em um número de ponto 
        flutuante. */
        valor = LPIII20152003.calcula_valor(valor);
        /* O método da linha 195 é chamado, pois passou-se um float como
        parâmetro. */
        
        r1.setText(String.valueOf(valor));
        /* valueOf é um método estático. Por isso é chamado através do nome da
        classe String. Ele basicamente transforma um número em um texto, para
        que possa ser exibido pelo objeto que está armazenado na variável r1. 
        */
        
        int inteiro = Integer.parseInt(e.getActionCommand());
        /* Similar à linha 223, mas agora o processamento retorna um inteiro. */
        
        inteiro = LPIII20152003.calcula_valor(inteiro);
        /* o método da linha 203 é chamado, pois passou-se um inteiro
        como parâmetro. */
        
       r2.setText(String.valueOf(inteiro));
       /* valueOf é um método estático. Por isso é chamado através do nome da
        classe String. Ele basicamente transforma um número em um texto, para
        que possa ser exibido pelo objeto que está armazenado na variável r2. 
        */
       
       try{
           
           if(valor > 10){
               throw new ExceptionComReais("Tive problemas com números reais. ");
               /* A palavra reservada throw é utilizada para lançar exceções
               de dentro do bloco try. Assim, quando esta linha for executada, 
               o processamento será desviado para o bloco catch passando-se 
               como parâmetro o objeto instanciado e lançado por esta linha. 
               */
           }
           
           if(inteiro > 10){
               throw new ExceptionComInteiros("Tive problemas com inteiros. ");
               /* O mesmo comentário da linha 256. Porém, perceba que 
               o objeto que está sendo criado mudou. Perceba também que uma 
               exceção é um objeto de uma classe Exception. */
           }

       }catch(Exception ex){
           System.out.println(ex.getMessage());
           /* Aqui se implementa programação genérica via herança e sobrecarga
           de métodos. Perceba que a mesma chamada de método executa métodos 
           diferentes dependendo do objeto em questão. */
       }
        
    }
    
}
