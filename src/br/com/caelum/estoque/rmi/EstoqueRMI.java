package br.com.caelum.estoque.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EstoqueRMI extends Remote{
	
	public ItemEstoque getItemEstoque(String codigoProduto) throws RemoteException;
}