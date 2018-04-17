package com.boxiao.RMI;

import java.rmi.RemoteException;  
import java.rmi.server.UnicastRemoteObject;  
  
public class HelloWorldRmi extends UnicastRemoteObject implements MyHello {  
  
   
    private static final long serialVersionUID = -5537185508353408293L;  
  
    protected HelloWorldRmi() throws RemoteException {  
    }  
  
    @Override  
    public String helloworld() {  
        return "HelloWorld!";  
    }  
      
      
  
}  