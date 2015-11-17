
package lpiii.pkg2015.pkg2.pkg004;


public class LPIII20152004 {

    
    public static void main(String[] args) {
        /* inst é uma variável do tipo InstrumentoMusical, a qual é uma interface
        definida neste programa. Assim, em java, interfaces também são tipos
        de dados, da mesma forma que classes também são tipos de dados. 
        */
        InstrumentoMusical inst;
        
        /* Embora inst seja uma variável do tipo InstrumentoMusical, ela está
        recebendo um objeto do tipo Bateria. Perceba que não ocorre erro de 
        compilação nem de execução. Isto acontece porque Bateria "herda" de 
        InstrumentoMusical, ou seja, Bateria é um InstrumentoMusical. 
        Consequentemente, uma variável que é do tipo de uma classe mãe, ou de
        uma interface mãe, pode receber objeto de suas classes filhas, sem 
        qualquer erro de compilação ou execução. 
        */
        inst = new Bateria();
        
        /* O método tocar está sendo chamado. Perceba que este método está defi-
        nido tanto na interface mãe, InstrumentoMusical, quanto na classe filha,
        Bateria. Através da mensagem mostrada na tela percebemos que o método
        da classe filha está sendo chamado, mas o cabeçalho é o mesmo que 
        aquele definido em InstrumentoMusical. */
        inst.tocar();
        
        /* A mesma variável inst agora está recebendo um objeto da classe Piano,
        que também implementa a interface InstrumentoMusical. Assim, os mesmos
        comentários da classe Bateria também se aplicam neste caso. */
        inst = new Piano();
        
        /* O mesmo método tocar está sendo chamado. Porém, perceba que a mesa-
        gem da tela mudou. Isto ocorreu porque o objeto mudou. Desta forma, 
        embora o cabeçalho do método tenha permanecido o mesmo, o comportamento
        mudou. Ista é uma das formas de programação genérica que é possível de
        ser feita graças aos conceitos de orientação a objetos tais como 
        herança e sobrecarga de métodos. */
        inst.tocar();
        
        /* Os mesmos comentários de Bateria e Piano se aplicam a Violao. */
        inst = new Violao();
        
        /* Perceba que a mensagem da tela mudou mais uma vez, mas que 
        o cabeçalho do método continua o mesmo. */
        inst.tocar();
    }
    
}
