/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author 2dam
 */
public class Message implements Serializable {
    private User user;
    private SignIn signIn;
    private Type callType;
    
    //Constructors

    public Message() {
    }

    public Message(User user, SignIn signIn, Type callType) {
        this.user = user;
        this.signIn = signIn;
        this.callType = callType;
    }
    
    //Getters and Setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SignIn getSignIn() {
        return signIn;
    }

    public void setSignIn(SignIn signIn) {
        this.signIn = signIn;
    }

    public Type getCallType() {
        return callType;
    }

    public void setCallType(Type callType) {
        this.callType = callType;
    }
    
    
    //to String

    @Override
    public String toString() {
        return "Message{" + "user=" + user + ", signIn=" + signIn + ", callType=" + callType + '}';
    }
    
    
    
    
}
