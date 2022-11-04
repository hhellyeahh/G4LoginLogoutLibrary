/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author 2dam
 */
public class ServerException extends Exception {

    /**
     * Creates a new instance of <code>ServerException</code> without detail
     * message.
     */
    public ServerException() {
    }

    /**
     * Constructs an instance of <code>ServerException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ServerException(String msg) {
        super(msg);
    }
}
