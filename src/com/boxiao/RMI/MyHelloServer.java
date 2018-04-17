package com.boxiao.RMI;

import java.net.MalformedURLException;  
import java.rmi.Naming;  
import java.rmi.RemoteException;  
import java.rmi.registry.LocateRegistry;  
  
public class MyHelloServer {  
  
    public static void main(String[] args) {  
  
        try {  
            MyHello hello = new HelloWorldRmi();  
            LocateRegistry.createRegistry(9999);  
            Naming.rebind("//localhost:9999/hello", hello);  
            System.out.println("waiting for client!");  
        } catch (RemoteException e) {  
            e.printStackTrace();  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        }   
    }  
  
}  
