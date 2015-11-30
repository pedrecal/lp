
package lpiii.pkg2015.pkg2.pkg007;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LPIII20152007 extends JFrame implements ActionListener {

    /* Na linha acima a nossa classe está herdando de JFrame. Isso significa que ela
    também é um JFrame. Além disso, nossa classe JFrame implementa a interface 
    ActionListener, e isso significa que ela herda os métodos desta interface, 
    e constrói um corpo para cada método herdado. Perceba que uma interface 
    não pode ser instanciada diretamente, e isso significa que uma interface
    faz o papel de uma classe abstrata que contém apenas métodos, haja vista
    que interfaces não possuem atributos. Desta forma, temos na linha 9 um 
    exemplo de herança múltipla, pois nossa classe herda ao mesmo tempo de 
    JFrame e ActionListener. */

    private final JLabel prompt;
    /* Na linha 21 pronpt é uma variável do tipo JLabel. Esta classe é utlizada 
    para implementar textos estáticos em janelas, ou seja, textos que não podem
    ser modificados pelo usuário, mas apenas pelo próprio programa. */
    
    JTextField input_1, input_2, saida_1;
    /* Estas variáveis são do tipo JTextField. Elas são utilizadas para implementar
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
    a memória deste objeto. */
    
    JLabel r2, r3;
    // Veja o comentário de r1
    
    JButton botao;
    // Uma variável do tipo botão. Neste caso, nosso programa agrega o botão. 
    // Assim, este é um exemplo de agregação de objetos. 
    
    public LPIII20152007(){
        super();
        /* super neste caso é um nome reservado, e aqui está sendo utilizado
        para chamar primeiro o construtor da classe mãe, para que só então
        o construtor desta classe seja executado. Isto é importante às vezes
        porque os métodos a seguir são da classe mãe, e por isso, caso o
        construtor da classe mãe não seja executado primeiro, então há a possi-
        bilidade de que estes métodos não possam ser chamados ou sejam chamados
        para um objeto vazio, o que causaria erro em tempo de execução. */
        
        setSize(220, 180);
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
        
        SpringLayout layout = new SpringLayout();
        container.setLayout(layout);
        /* Nestas duas linhas estamos dizendo para o painel
        qual deve ser seu gerenciador de layout. Existem vários. Uma opção
        é o SpringLayout. O que ele faz? Ele permite que a posição dos 
        objetos na janela sejam ajustados em relação aos seus objetos 
        vizinhos. Assim, para cada objeto pelo menos duas de suas bordas
        devem possuir algum tipo de ligação com outros objetos, e para cada
        ligação a distância entre as bordas deve ser informada. */
        
        prompt = new JLabel("Número A: ");
        /* O mesmo comentário da linha 21. Porém, neste caso o objeto está sendo
        criado. Na linha 21 a única coisa que havia sido feita era a declara-
        ção da variável, mas sem a criação do objeto. Perceba que esta é 
        uma operação típicamente implementada dentro de métodos construtores, 
        como nós estamos fazendo agora. */ 
        
        r2 = new JLabel("Número B: ");
        /* O mesmo comentário da linha 21. */ 
        
        r3 = new JLabel("Resultado: ");
        /* O mesmo comentário da linha 21. */ 
        
        input_1 = new JTextField(10);
        input_2 = new JTextField(10);
        saida_1 = new JTextField(10);
        /* Os campos de entrada estão sendo criados com comprimento 10.  */
        
        container.add(prompt);
        
        /* Veja os comentários da linha 88 e 75. Perceba que abaixo apenas 
        estamos inserindo os objetos, mas que não é necessário dizer qual é
        a posição deles. */
               
        container.add(r1);
        
        container.add(input_1);

        container.add(r2);
        
        container.add(input_2);
        
        botao = new JButton("Calcular");
        
        container.add(botao);
        
        botao.addActionListener(this);
        // Esta linha está dizendo que o objeto this, que é um objeto da 
        // classe LPIII20152007, irá 'ouvir' eventos vindos do botão. 
        // Isto significa que a classe LPIII20152007 deve implementar o
        // método actionPerformed, para processar o evento vindo do botão. 
        
        container.add(saida_1);
        
        container.add(r3);
        

        /* Estas linhas são usadas para especificar a distância entre cada objeto
        com isso é possível definir a posição de cada objeto, bastando para isso
        dizer para pelo menos duas bordas de cada objeto qual deve ser a distância
        entre cada uma delas e seus objetos vizinhos. 
        Estude a descrição da API do java sobre o método putConstaint. */
        layout.putConstraint(SpringLayout.WEST, input_1, 80, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, input_1, 0, SpringLayout.NORTH, container);
        
        layout.putConstraint(SpringLayout.NORTH, r2, 10, SpringLayout.SOUTH, input_1);
        layout.putConstraint(SpringLayout.WEST, r2, 0, SpringLayout.WEST, container);
        
        layout.putConstraint(SpringLayout.WEST, input_2, 80, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, input_2, 10, SpringLayout.SOUTH, input_1);
        
        layout.putConstraint(SpringLayout.WEST, botao, 80, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, botao, 10, SpringLayout.SOUTH, r2);
        
        layout.putConstraint(SpringLayout.WEST, saida_1, 80, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, saida_1, 10, SpringLayout.SOUTH, botao);
        
        layout.putConstraint(SpringLayout.WEST, r3, 0, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, r3, 10, SpringLayout.SOUTH, botao);
                
    }
    
        public static void main(String[] args) {
        
        try{
            /* Na linha acima, ou seja, usa-se o comando try-catch. 
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
            LPIII20152007 app = new LPIII20152007();
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
    
    public void actionPerformed(ActionEvent e) {
        try{
            float a = Float.parseFloat(input_1.getText());
            float b = Float.parseFloat(input_2.getText());
            
            float c = a + b;
            
            saida_1.setText(Float.toString(c));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}

