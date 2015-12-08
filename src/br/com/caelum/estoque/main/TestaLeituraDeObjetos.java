package br.com.caelum.estoque.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

/**
 * 
 * @author tca85
 *
 */
public class TestaLeituraDeObjetos {

	public static void main(String[] args) throws IOException{
		try {
			@SuppressWarnings("resource")
			ObjectInputStream desserializador = new ObjectInputStream(new FileInputStream("itens.bin"));

			@SuppressWarnings("unchecked")
			List<ItemEstoque> itens = (List<ItemEstoque>) desserializador.readObject();
			
			for (ItemEstoque itemEstoque : itens) {
				System.out.println(itemEstoque.getCodigo());
				System.out.println(itemEstoque.getQuantidade());
				System.out.println("----------------------------");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
