package Projetos;

public class SlowPrinter {
	// Método para imprimir uma mensagem lentamente, caractere por caractere
	public static void slowPrint(String mensagem, int delay) {
		 // Converte a mensagem em um array de caracteres e itera sobre cada caractere
		for (char c : mensagem.toCharArray()) {
			System.out.print(c); // Imprime o caractere atual sem quebrar a linha
			try {
				Thread.sleep(delay); // Pausa a execução pelo tempo especificado em 'delay' milissegundos
			} catch (InterruptedException e) {
				e.printStackTrace(); // Imprime o stack trace se a thread for interrompida
			}
		}
		System.out.println(); // Para adicionar uma nova linha após a mensagem
	}
}
