/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg006;


public class LPIII20152006 {

    static InstrumentoMusical instrumento(int i){
        try{
            if(i == 0){
                return new Violao();
            }else if(i == 1){
                return new Piano();
            }else{
                return new Bateria();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        
        InstrumentoMusical i = instrumento(0);
        
        i.tocar();
        
        i = instrumento(1);
        
        i.tocar();
        
        i = instrumento(2);
        
        i.tocar();
    }
    
}
