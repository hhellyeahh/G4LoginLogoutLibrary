
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class ClientImplementation implements LoginLogout {

    public ClientImplementation() {
    }

    @Override
    public User logIn(User user) {
        
        Message message = new Message();
        message.setUser(user);
        message.setCallType(Type.LOGIN_REQUEST);
        message.setSignIn(new SignIn(new Timestamp(System.currentTimeMillis()), user.getId()));
        
         ClientSocket clientSocket = new ClientSocket();
         
        try {
            Message returnMessage = new Message();
            returnMessage = clientSocket.sendRecieve(message);
            User returnUser = new User();
            returnUser = returnMessage.getUser();
            user = returnUser;
        } catch (IOException ex) {
            Logger.getLogger(ClientImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return user ;
    }

    @Override
    public User signUp(User user) {
        
        Message message = new Message();
        message.setUser(user);
        message.setCallType(Type.SIGNUP_REQUEST);
        
        
        return user;
    }
    
}

