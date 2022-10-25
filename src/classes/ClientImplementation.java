/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Timestamp;

/**
 *
 * @author 2dam
 */
public class ClientImplementation implements LoginLogout {

    public ClientImplementation() {
    }

    @Override
    public User login(User user) {
        
        Message message = new Message();
        message.setUser(user);
        message.setCallType(Type.LOGIN_REQUEST);
        message.setSignIn(new SignIn(new Timestamp(System.currentTimeMillis()), user.getId()));
        
        
        return user;
    }

    @Override
    public User SignIn(User user) {
        
        Message message = new Message();
        message.setUser(user);
        message.setCallType(Type.SIGNUP_REQUEST);
        
        
        return user;
    }
    
}
