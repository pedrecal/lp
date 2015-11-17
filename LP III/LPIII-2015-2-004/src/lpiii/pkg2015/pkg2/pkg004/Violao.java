/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg004;

/*
  Violão é uma classe que implementa a interface InstrumetoMuscial. Assim, os co-
mentários são análogos aos da classe Bateria.
*/

public class Violao implements InstrumentoMusical {
    
    public void tocar(){
        try{
            System.out.println("Tocando violão...");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
