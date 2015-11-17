/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg005;


public class ImpressoraMultifuncional extends Impressora implements Escaner, 
        Copiadora {
    // Classe polimórfica, ou seja, ela possui várias formas, dentre elas:
    // Escaner, Copiadora, e Impressora. Porém, apenas uma é uma classe, ou 
    // seja, Impressora, enquanto as outras são interfaces. 

    public ImpressoraMultifuncional(String n){
        super(n);
        // Chama o construtor da classe mãe Impressora, passando 
        // o nome da impressora como parâmetro. 
    }
    
    // Implementa o método escanear da interface Escâner. 
    public void escanear() {
        System.out.println("Impressora " + nome + " escaneando...");
    }
    
    // Implementa o método copiar da interface copiadora. 
    public void copiar() {
        System.out.println("Impressora " + nome + " copiando...");
    }
    
}
