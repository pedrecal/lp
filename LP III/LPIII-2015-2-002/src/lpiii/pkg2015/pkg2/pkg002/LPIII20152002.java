/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg002;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author paulo
 */
public class LPIII20152002 extends JFrame implements ActionListener {

    JLabel prompt;
    JTextField input;
    static JLabel r1 = new JLabel(" ");
    JLabel r2;
    JLabel r3;
    JLabel sroot;
    
    public LPIII20152002(){
        super();
        
        setSize(400, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        prompt = new JLabel("Entre com o raio: ");
        r2 = new JLabel(" ");
        sroot = new JLabel(" ");
        input = new JTextField(10);
        input.addActionListener(this);
        container.add(prompt);
        container.add(input);
        container.add(r1);
        container.add(r2);
        container.add(sroot);
        
    }
    
    public static void main(String[] args) {
        try{
            LPIII20152002 app = new LPIII20152002();
        
            EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                app.setVisible(true);
  
            }
        });
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
    
    static private float calcula_volume(float valor){
        System.out.println("float...");
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(valor, 3.0));
    }
    
    static private int calcula_volume(int valor){
        System.out.println("int...");
        return (int) ((4.0 / 3.0) * Math.PI * Math.pow(valor, 3.0));
    }
    
    static private float calcula_sroot(float valor){
        System.out.println("float...");
        return (float) (Math.sqrt(valor));
    }

    public void actionPerformed(ActionEvent e) {
        
        float valor = Float.parseFloat(e.getActionCommand());
        valor = LPIII20152002.calcula_volume(valor);
        
        r1.setText(String.valueOf(valor));
        
        int inteiro = Integer.parseInt(e.getActionCommand());
        inteiro = LPIII20152002.calcula_volume(inteiro);
        
        r2.setText(String.valueOf(inteiro));
        
        float raiz = Float.parseFloat(e.getActionCommand());
        raiz = LPIII20152002.calcula_sroot(raiz);
        
        
        sroot.setText(String.valueOf(raiz));
        
        
    }
    
}
