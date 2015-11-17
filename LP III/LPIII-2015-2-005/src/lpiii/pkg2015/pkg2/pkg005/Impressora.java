
package lpiii.pkg2015.pkg2.pkg005;

public class Impressora {
    protected String nome;
    
    public Impressora(String n){
        nome = n;
    }
    
    public void imprimir(){
        System.out.println("Impressora " + nome + " imprimindo...");
    }
}
