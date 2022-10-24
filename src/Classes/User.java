/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author 2dam
 */
public class User implements Serializable{
    
    
    private Integer id;
    private String login;
    private String email;
    private String fullName;
    private UserPrivilege privilege;
    private UserStatus status;
    private String password;
    private Timestamp lastPasswordChange; 

    
    
    // Constructor 
    
    
    
    public User() {
    }

    public User(Integer id, String login, String email, String fullName, UserPrivilege privilege, UserStatus status, String password, Timestamp lastPasswordChange) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.privilege = privilege;
        this.status = status;
        this.password = password;
        this.lastPasswordChange = lastPasswordChange;
    }
    
    
    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserPrivilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
    
    
    //To String

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", email=" + email + ", fullName=" + fullName + ", privilege=" + privilege + ", status=" + status + ", password=" + password + ", lastPasswordChange=" + lastPasswordChange + '}';
    }
    
    
    
    
}
