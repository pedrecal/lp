/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg005;

public class LPIII20152005 {

    public static void main(String[] args) {
        
        ImpressoraMultifuncional im = new ImpressoraMultifuncional("Epson CX 4900");
        
        Impressora i = im;
        // Neste ponto tem-se o exemplo de utilização do polimorfismo.
        // Neste caso, o objeto que está em 'im' é uma impressora 
        // multifuncional, mas ele também é uma impressora porque 
        // ele herda de impressora. Portanto, a atribuição está correta. 
       
        
        i.imprimir();
        // Este método foi herdado de impressora. Neste caso não seria possível
        // executar 'escanear' ou 'copiar'. 
        
        Escaner e = im;
        
        // Neste ponto tem-se o exemplo de utilização do polimorfismo.
        // Neste caso, o objeto que está em 'im' é uma impressora 
        // multifuncional, mas ele também é um escâner porque 
        // ele herda de escâner. Portanto, a atribuição está correta. 
        
        e.escanear();
        // Este método foi herdado de escâner. Neste caso não seria possível
        // executar 'imprimir' ou 'copiar'. 
        
        Copiadora c = im;
        
        // Neste ponto tem-se o exemplo de utilização do polimorfismo.
        // Neste caso, o objeto que está em 'im' é uma impressora 
        // multifuncional, mas ele também é uma copiadora porque 
        // ele herda de copiadora. Portanto, a atribuição está correta. 
        
        c.copiar();
        
        // Este método foi herdado de copiadora. Neste caso não seria possível
        // executar 'escanear' ou 'imprimir'. 
        
    }
    
}
