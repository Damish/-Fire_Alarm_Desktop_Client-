/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Add.Interface;

/**
 *
 * @author kisal
 */
import java.rmi.*;

public interface AddInterface extends Remote {

    public boolean AddItem(int floor, int room) throws RemoteException;
    //public boolean Update (String id,String floor,String room)throws RemoteException;
    
//    public void setEmailInput(String email);
//    
}
