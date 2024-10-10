package Projetos;

public class Item {
	private String nome;

	public Item(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + "]";
	}

}
