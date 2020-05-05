
package Update.Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Damish
 */
public interface UpdateInterface2 extends Remote {

    public boolean UpdateItem(String sid,int floor, int room) throws RemoteException;
    //public boolean Update (String id,String floor,String room)throws RemoteException;
}

