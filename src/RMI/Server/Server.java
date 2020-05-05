
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI.Server;

/**
 *
 * @author kisal
 */
import Crud.implement.AddImpl;
import Crud.implement.UpdateImpl;
import Crud.implement.LoginImplement;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {

    public static void main(String[] args) {
        try {

            Registry reg = LocateRegistry.createRegistry(1099);
            AddImpl ip = new AddImpl();
            reg.rebind("Add", ip);
            
            UpdateImpl ip2 = new UpdateImpl();
            reg.rebind("Update", ip2);
          
            LoginImplement lp=new LoginImplement();
            reg.rebind("login", lp);
            
            System.out.println("RMI server started and running in background");
          

        
            
        } catch (Exception e) {

           System.out.println("Something failed in server.java!!!");

        }

    }

}
