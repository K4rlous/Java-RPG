package Projetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Backup {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		// Contador de vida
		int vida = 3;
		
		// Inicialização da variável de opções
		int op = 0;
		
		// Inicialização do inventário
		@SuppressWarnings("unused")
		Inventory inventario = new Inventory();
		
		Utilidades.Aguardar();
		System.out.println(" ____    ____     ____ ");
        System.out.println("|  _ \\  |  _ \\   / ___|");
        System.out.println("| |_) | | |_) | | |  _ ");
        System.out.println("|  _ <  |  __/  | |_| |");
        System.out.println("|_| \\_\\ |_|      \\____|");
        Utilidades.Aguardar();
        Utilidades.Espaco();
        while (true) {
            try {
                String a4 = "Digite uma opção!";SlowPrinter.slowPrint(a4, 75);              
                String a5 = "1 - Começar Jogo / 2 - Sair";SlowPrinter.slowPrint(a5, 75);                                
                op = in.nextInt(); 
                in.nextLine(); // limpa o buffer                
                if (op == 1 || op == 2) {
                    break; // sai do loop se a opção for válida
                } else {
                    System.out.println("Opção Inválida!"); // opção fora do esperado
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número válido!.");
                in.nextLine(); // limpa o buffer após uma exceção
            }
        }
        if(op == 1) {
        	Utilidades.Espaco();
        	String a7 = "São tempos sombrios.....";SlowPrinter.slowPrint(a7, 75);
        	String a8 = "Uma terrível sombra se ergueu no leste, sob a forma de um necromante...";SlowPrinter.slowPrint(a8, 75);
        	String a9 = "Suas legiões de mortos trouxeram caos e destruição ao mundo dos homens...";SlowPrinter.slowPrint(a9, 75);
        	String a10 = "Em resposta, o Papa ordenou uma cruzada...";SlowPrinter.slowPrint(a10, 75);
        	String a11 = "Você junto de muitos outros soldados marcharam através da terra devastada...";SlowPrinter.slowPrint(a11, 75);
        	String a12 = "Procurando por rastros que os levassem ao covil do necromante";SlowPrinter.slowPrint(a12, 75);
        	String a13 = "Tudo isso foi em vão...."; SlowPrinter.slowPrint(a13, 75);
        	Utilidades.Aguardar();
        	Utilidades.Espaco();
        	String a14 = "Cada soldado humano tombado em batalha, significava um soldado a mais para o inimigo...";SlowPrinter.slowPrint(a14, 75);
        	String a15 = "Logo a esperança se perdeu, uma vez que vocês não encontravam o necromante em lugar algum...";SlowPrinter.slowPrint(a15, 75);
        	String a16 = "E então.... Numa cruel emboscada, você se viu diante do horror inimaginável.....";SlowPrinter.slowPrint(a16, 75);
        	String a17 = "Aquele seu amigo.... Qual era mesmo o nome dele? ";SlowPrinter.slowPrint(a17, 75);        
        	String aliado = in.nextLine();
        	String a18 = "Sim, seu amigo " + aliado + " havia tombado em combate, e agora lutava contra você reanimado pelo necromante";SlowPrinter.slowPrint(a18, 75);
        	String a19 = "É triste pensar que você teria o peito perfurado pela lança daquele em que você tanto confiava";SlowPrinter.slowPrint(a19, 75);
        	String a20 = "Mas se alguém é culpado disso, certamente é o maldito necromante";SlowPrinter.slowPrint(a20, 75);
        	Utilidades.Espaco();
        	String a21 = "Naquele dia, você morreu";SlowPrinter.slowPrint(a21, 75);
        	String a22 = "Mas hoje, você renascerá";SlowPrinter.slowPrint(a22, 75);
        	String a23 = "E cabe a você, levar a justiça dos homens, aos mortos...";SlowPrinter.slowPrint(a23, 75);
        	Utilidades.Espaco();
        	String a24 = "Você acorda com uma sensação estranha, como se tivesse dormido por um século."; SlowPrinter.slowPrint(a24, 75);
        	String a25 = "O ambiente ao seu redor é sombrio e enevoado, com um ar pesado que mal permite respirar."; SlowPrinter.slowPrint(a25, 75);
        	String a26 = "A memória do último confronto ainda está fresca na sua mente, um lembrete doloroso de sua morte."; SlowPrinter.slowPrint(a26, 75);
        	String a27 = "No chão ao seu redor, as marcas da batalha ainda estão visíveis, mas há algo diferente."; SlowPrinter.slowPrint(a27, 75);
        	String a28 = "A luz fraca de uma fogueira ao longe chama sua atenção, como um farol na escuridão."; SlowPrinter.slowPrint(a28, 75);
        	String a29 = "Você sente uma força misteriosa impulsionando-o a seguir em direção à luz."; SlowPrinter.slowPrint(a29, 75);
        	String a30 = "Cada passo é uma luta contra a gravidade, mas você sabe que precisa seguir em frente."; SlowPrinter.slowPrint(a30, 75);
        	String a31 = "Sentado junto a fogueira, repousa um velho homem, ele nota sua aproximação, mas não parece assustado com sua mórbida aparência"; SlowPrinter.slowPrint(a31, 75);
        	String a32 = "   -Foi difícil quebrar o vinculo do necromante com sua alma, se eu não o tivesse feito, você estaria sobre o controle dele agora"; SlowPrinter.slowPrint(a32, 75);
        	String a33 = "   -Ele consegue sentir sua presença, e muito em breve você vai notar a dele também, te impulsionando a maldade e a malicia"; SlowPrinter.slowPrint(a33, 75);
        	String a34 = "   -Mas isso pode vir a calhar, ouça os susurros dele em sua mente, vá até ele, ache-o, e acabe com isso, pelo bem de todos nós"; SlowPrinter.slowPrint(a34, 75);
        	// Restauramos o valor da variável op para podermos realizar novas escolhas utilizando a mesma variável
        	op = 0;
        	while (true) {
                try {
                    String a35 = "O que você diz?";SlowPrinter.slowPrint(a35, 75);
                    String a36 = "1 - Por onde devo começar?  / 2 - Nem pensar!";SlowPrinter.slowPrint(a36, 75);                          
                    op = in.nextInt(); 
                    in.nextLine();                   
                    if (op == 1 || op == 2) {
                        break; 
                    } else {
                        System.out.println("Opção Inválida!"); 
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número válido!.");
                    in.nextLine(); 
                }
            }
        	if (op == 2) {
        		String a37 = "Você sente o peso da missão, mas a escuridão em seu coração recusa a obrigação."; SlowPrinter.slowPrint(a37, 75);
        		String a38 = "   -Eu não posso aceitar essa missão, para falar a verdade, eu não deveria estar aqui."; SlowPrinter.slowPrint(a38, 75);        
        		String a39 = "Os olhos do herói morto-vivo brilham com uma tristeza profunda enquanto ele balança a cabeça negativamente."; SlowPrinter.slowPrint(a39, 75);
        		String a40 = "   -Você precisa encontrar outro, alguém que não esteja preso a este limbo eterno."; SlowPrinter.slowPrint(a40, 75);
        		String a41 = "Ele vira as costas, confuso, e segue andando sem rumo pelo campo de batalha"; SlowPrinter.slowPrint(a41, 75);
        		String a42 = "   -Então você não serve de nada para mim... Diz o velho homem conjurando uma magia pelas suas costas"; SlowPrinter.slowPrint(a42, 75);
        		String a43 = "Suas costas emergem em chamas por causa da bola de fogo conjurada pelo velhote"; SlowPrinter.slowPrint(a43, 75);
        		String a44 = "Dessa vez, você morreu........ de verdade."; SlowPrinter.slowPrint(a44, 75);
        	} else {
        		System.out.println("Que bom!");
        }
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        } else if (op == 2) {
        	String a6 = "Encerrando...";SlowPrinter.slowPrint(a6, 75);
        } else 
        
        // Tratamento de morte
        if(vida <= 1) {
			String a1 = "Você tomba devido a seus ferimentos";SlowPrinter.slowPrint(a1, 75);
			String a2 = "Seu nome será esquecido";	SlowPrinter.slowPrint(a2, 75);
			String a3 = "E os ratos roerão seus ossos...";		SlowPrinter.slowPrint(a3, 75);
	
		}
		in.close();
        

	}

}