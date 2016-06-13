package org.rmi.service.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Hello world!
 *
 */
public interface HelloApi extends Remote {
	public String printMessage(String message) throws RemoteException;
}
