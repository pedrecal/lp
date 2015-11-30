/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpiii.pkg2015.pkg2.pkg003;

/**
 *
 * @author paulo
 */
public class ExceptionComReais extends Exception {

    /**
     * Creates a new instance of <code>ExceptionComReais</code> without detail
     * message.
     */
    public ExceptionComReais() {
    }

    /**
     * Constructs an instance of <code>ExceptionComReais</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionComReais(String msg) {
        super(msg);
    }
    
    public String getMessage() {
        return "Exceção com reais: " + super.getMessage();
    }
}
