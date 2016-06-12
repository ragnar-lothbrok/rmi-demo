package org.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.rmi.service.api.HelloApi;

/**
 * Hello world!
 *
 */
public class HelloClient 
{
    public static void main( String[] args )
    {
    	try {
			Registry registry = LocateRegistry.getRegistry("127.0.0.1",8899);
			HelloApi helloApi = (HelloApi) registry.lookup("hello-service");
			System.out.println(helloApi.printMessage("Success"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
