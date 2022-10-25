/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author 2dam
 */
public class SignIn implements Serializable {
    private Timestamp lastSignIn;
    private Integer userID;
    
    
    //Constructor

    public SignIn() {
    }

    public SignIn(Timestamp lastSignIn, Integer userID) {
        this.lastSignIn = lastSignIn;
        this.userID = userID;
    }
   
    //Getters and Setters

    public Timestamp getLastSignIn() {
        return lastSignIn;
    }

    public void setLastSignIn(Timestamp lastSignIn) {
        this.lastSignIn = lastSignIn;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    
    
    
    
    
}
