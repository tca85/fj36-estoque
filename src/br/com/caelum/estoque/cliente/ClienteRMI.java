package br.com.caelum.estoque.cliente;

import java.rmi.Naming;

import br.com.caelum.estoque.rmi.EstoqueRMI;
import br.com.caelum.estoque.rmi.ItemEstoque;

/**
 * 
 * @author tca85
 *
 */
public class ClienteRMI {
	
	public static void main(String[] args) throws Exception{
		EstoqueRMI estoque = (EstoqueRMI) Naming.lookup("rmi://localhost:1099/estoque");
		
		ItemEstoque item = estoque.getItemEstoque("ARQ");
		
		System.out.println("Quantidade disponível: " + item.getQuantidade());
	}
}