/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ResourceBundle;

/**
 *
 * @author Leire, Zulu
 */
public class Factory {

    private static LoginLogout data;

    /**
     * Load the data variable, if it is not previously loaded
     *
     * @return data LoginLogout
     */
    public static LoginLogout getLoginLogout() throws UnknownModelTypeException {

        switch (ResourceBundle.getBundle("G4LoginLogoutLibrary/config").getString("LOGINLOGOUT")) {
            case "CLIENT":
                data = new ClientImplementation();
                break;
            case "SERVER":
                data = new ServerImplementation();
                break;
            default:
                throw new UnknownModelTypeException("That type of model is not valid.");
        }
        return data;
    }
}
