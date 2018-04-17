package com.boxiao.RMI;

import java.rmi.Remote;  
import java.rmi.RemoteException;  
  
public interface MyHello extends Remote {  
  
    /** 
     * @return 
     * @throws RemoteException 
     */  
    public String helloworld() throws RemoteException; 
  
}  