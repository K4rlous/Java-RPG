	package Projetos;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> itens;

	public Inventory() {
		this.itens = new ArrayList<>(); // Inicializa a lista de itens
	}

	public void adicionarItem(String nome) {
		Item item = new Item(nome);
		itens.add(item);
	}

	public void listarItens() {
		if (itens.isEmpty()) {
			System.out.println("O inventário está vazio.");
		} else {
			for (Item item : itens) {
				System.out.println(item);
			}
		}
	}

	public boolean verificarItem(String nome) {
		for (Item item : itens) {
			if (item.getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}
}
