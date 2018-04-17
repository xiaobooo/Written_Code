package com.boxiao.RMI;

import java.net.MalformedURLException;  
import java.rmi.Naming;  
import java.rmi.NotBoundException;  
import java.rmi.RemoteException;  
  
public class MyHelloClient {  
  
    public static void main(String[] args) {  
  
        try {  
            MyHello hello = (MyHello) Naming.lookup("//localhost:9999/hello");  
            System.out.println(hello.helloworld());  
              
        } catch (MalformedURLException | RemoteException | NotBoundException e) {  
            e.printStackTrace();  
        }  
  
    }  
  
}  