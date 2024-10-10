package Projetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

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
        Cap01.RPG();
        Utilidades.Aguardar();
        Utilidades.Espaco();
        
        while (true) {
            try {
                String escolha1 = "Digite uma opção!"; SlowPrinter.slowPrint(escolha1, 75);
                String escolha2 = "1 - Começar Jogo / 2 - Sair"; SlowPrinter.slowPrint(escolha2, 75);
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
        
        if (op == 1) {
            Utilidades.Espaco();
            Cap01.Intro1();
            Utilidades.Aguardar();
            Utilidades.Espaco();
            Cap01.Intro2();    
            Cap01.Intro3(in);    
            Utilidades.Espaco();
            Cap01.Intro4();
            Utilidades.Espaco();
            Cap01.Intro5();
            
            // Restauramos o valor da variável op para podermos realizar novas escolhas utilizando a mesma variável
            op = 0;
            Utilidades.Espaco();
            while (true) {
                try {
                    String escolha3 = "O que você diz?"; SlowPrinter.slowPrint(escolha3, 75);
                    String escolha4 = "1 - Por onde devo começar?  / 2 - Nem pensar!"; SlowPrinter.slowPrint(escolha4, 75);
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
                Cap01.RecusarQuest();
            } else {
                Cap01.AceitarQuest();
            }

        } else if (op == 2) {
            String encerrando = "Encerrando..."; SlowPrinter.slowPrint(encerrando, 75);
        }
        
        // Tratamento de morte
        if (vida <= 1) {
            Cap01.Morte();
        }
        
        in.close();
    }
}
