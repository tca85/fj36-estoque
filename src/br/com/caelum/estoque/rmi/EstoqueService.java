package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 * UnicastRemoteObject permite a classe ser chamada remotamente
 * 
 * @author tca85
 *
 */
public class EstoqueService extends UnicastRemoteObject implements EstoqueRMI{

	private static final long serialVersionUID = 1L;
	
	private Map<String, ItemEstoque> repositorio = new HashMap<>();

	public EstoqueService() throws RemoteException {
		repositorio.put("ARQ", new ItemEstoque("ARQ", 5));
		repositorio.put("SOA", new ItemEstoque("ARQ", 2));
		repositorio.put("TDD", new ItemEstoque("TDD", 3));
		repositorio.put("RES", new ItemEstoque("RES", 4));
		repositorio.put("LOG", new ItemEstoque("LOG", 3));
		repositorio.put("WEB", new ItemEstoque("WEB", 4));
	}

	/**
	 * Todos métodos precisam tratar a exceção RemoteException
	 */
	@Override
	public ItemEstoque getItemEstoque(String codigoProduto)	throws RemoteException {
		System.out.println("Verificando estoque do produto " + codigoProduto);

		return this.repositorio.get(codigoProduto);
	}
}