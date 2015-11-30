

import java.awt.EventQueue;

public class Project1 {

    public static void main(String[] args) {
            
        try{
            ProjectGUI app = new ProjectGUI();
        
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
