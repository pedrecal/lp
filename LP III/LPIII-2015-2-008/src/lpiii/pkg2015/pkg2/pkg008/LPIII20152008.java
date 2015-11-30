
package lpiii.pkg2015.pkg2.pkg008;

import java.awt.EventQueue;


public class LPIII20152008 {

    public static void main(String[] args) {
        try{
            Janela app = new Janela();
        
            EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                app.setVisible(true);
            }
        });

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
