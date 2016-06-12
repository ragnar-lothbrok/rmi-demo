package org.rmi.service.api.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.rmi.service.api.HelloApi;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloApi {

	private static final long serialVersionUID = 6899359989764045895L;

	public HelloServiceImpl() throws RemoteException {
		super();
	}

	public String printMessage(String message)throws RemoteException {
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome Dude!!!!\n").append(message);
		return sb.toString();
	}

}
