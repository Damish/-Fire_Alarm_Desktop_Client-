/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud.implement;

import login.interface2.LoginInterface;
/**
 *
 * @author Manjari
 */
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class LoginImplement extends UnicastRemoteObject implements LoginInterface {

    public LoginImplement() throws RemoteException {

    }

    public boolean getAdminLogin(String user, String pass) throws RemoteException {
        boolean found = false;
        try {
            if (user.equals("admin") && pass.equals("123") || user.equals("ADMIN") && pass.equals("123") ) {
                return found = true;
            } else {
                return found = false;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return found;
    }
    
    
    public boolean getClientLogin(String user, String pass) throws RemoteException {
        boolean found = false;
        try {
            if (user.equals("client") && pass.equals("123") || user.equals("CLIENT") && pass.equals("123")) {
                return found = true;
            } else {
                return found = false;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return found;
    }
    
    
    
}
