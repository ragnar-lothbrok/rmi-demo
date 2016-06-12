package org.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.rmi.service.api.impl.HelloServiceImpl;

public class MessageServer {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(8899);
			HelloServiceImpl helloApi = new HelloServiceImpl();
			registry.rebind("hello-service", helloApi);
			System.out.println("Server is ready...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
