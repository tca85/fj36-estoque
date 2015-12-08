package br.com.caelum.estoque.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author tca85
 *
 */
public interface EstoqueRMI extends Remote{
	
	public ItemEstoque getItemEstoque(String codigoProduto) throws RemoteException;
}