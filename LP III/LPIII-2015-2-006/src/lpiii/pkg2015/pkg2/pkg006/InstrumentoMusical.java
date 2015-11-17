/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg006;

/**
 * Instrumento musical é uma interface. Isso significa que ela não possui atri-
 * butos, mas apenas define métodos. Estes métodos podem ou não possuir corpo. 
 * Eles são usados principalmente (usualmente) para definir uma interface
 * padrão para todas as classes que implementam esta interface. Neste caso,
 * todas as classes que implementarem a interface chamada InstrumentoMuscial
 * terão que definir um corpo para o método tocar, com igual assinatura. 
 * Caso isso não aconteça, então a classe deverá ser definida como abstrada,
 * pois a mesma não poderá ser instanciada. 
 */
public interface InstrumentoMusical {
    public void tocar();
}
