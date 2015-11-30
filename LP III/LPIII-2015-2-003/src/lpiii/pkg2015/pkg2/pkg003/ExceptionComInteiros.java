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
public class ExceptionComInteiros extends Exception {

    /**
     * Creates a new instance of <code>ExceptionComInteiros</code> without
     * detail message.
     */
    public ExceptionComInteiros() {
    }

    /**
     * Constructs an instance of <code>ExceptionComInteiros</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionComInteiros(String msg) {
        super(msg);
    }
    
    public String getMessage() {
        return "Exceção com inteiros: " + super.getMessage();
    }
}
