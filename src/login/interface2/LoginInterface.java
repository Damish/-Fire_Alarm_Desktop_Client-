/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.interface2;

/**
 *
 * @author Manjari
 */
import java.rmi.*;
public interface LoginInterface extends Remote {
    public  boolean  getAdminLogin(String user,String pass)throws RemoteException;
    public  boolean  getClientLogin(String user,String pass)throws RemoteException;
}
