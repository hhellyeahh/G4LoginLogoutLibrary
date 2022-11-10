/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.*;

/**
 *
 * @author Zulu
 */
public interface LoginLogout {

    public User logIn(User user) throws IncorrectLoginException, ServerException, UnknownTypeException, MaxUserException;

    public User signUp(User user) throws ServerException, UserAlreadyExistExpection, UnknownTypeException;
}
