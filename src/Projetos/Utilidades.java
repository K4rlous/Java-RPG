package Projetos;

public class Utilidades {

	 // Método para pausar a execução por 3 segundos
	public static void Aguardar() {
		try {
			Thread.sleep(3000); // Pausa a execução por 3000 milissegundos (3 segundos)
		} catch (InterruptedException e) {
			e.printStackTrace(); // Imprime o stack trace se a thread for interrompida
		}
	}
	
	// Método para pausar a execução por um tempo especificado em milissegundos
	public static void Aguardar(int x) {
		try {
			Thread.sleep(x); // Pausa a execução pelo número de milissegundos especificado em 'x'
		} catch (InterruptedException e) {
			e.printStackTrace(); // Imprime o stack trace se a thread for interrompida
		}
	}
	
	// Método para imprimir quatro linhas em branco no console
	public static void Espaco() {
		System.out.println("");System.out.println("");System.out.println("");
	}

	
}
