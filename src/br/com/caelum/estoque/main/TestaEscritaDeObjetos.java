package br.com.caelum.estoque.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

/**
 * Testa e escrita de um arquivo com o nome itens.bin através
 * do processo de serialização
 * 
 * @author tca85
 *
 */
public class TestaEscritaDeObjetos {
	
	public static void main(String[] args) throws IOException {
		try {
			// Faz a serialização dos objetos em um arquivo
			ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("itens.bin"));

			ItemEstoque item1 = new ItemEstoque("ARQ", 2);
			ItemEstoque item2 = new ItemEstoque("ARQ", 3);

			List<ItemEstoque> itens = new ArrayList<ItemEstoque>();
			itens.add(item1);
			itens.add(item2);

			serializador.writeObject(itens);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}