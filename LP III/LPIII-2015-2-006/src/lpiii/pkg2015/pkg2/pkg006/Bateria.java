/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg006;

/*
  Bateria é uma classe que implementa a interface InstrumetoMuscial. Isto 
  significa que Bateria "herda" de InstrumentoMuscial os seus métodos. 
  Assim, Bateria pode ser vista como uma classe que é "filha" da interface
  InstrumentoMusical. Perceba que o método tocar está sendo sobrecarregado,
  mas que possui a mesma interface do método tocar. 
*/
public class Bateria implements InstrumentoMusical {

    
    public void tocar() {
        try{
            System.out.println("Tocando bateria...");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
