package Projetos;

import java.util.Scanner;

public class Cap01 {
    static void RPG() {
        System.out.println(" ____    ____     ____ ");
        System.out.println("|  _ \\  |  _ \\   / ___|");
        System.out.println("| |_) | | |_) | | |  _ ");
        System.out.println("|  _ <  |  __/  | |_| |");
        System.out.println("|_| \\_\\ |_|      \\____|");
    }

    static void Morte() {
        String morte1 = "Você tomba devido a seus ferimentos"; SlowPrinter.slowPrint(morte1, 75);
        String morte2 = "Seu nome será esquecido"; SlowPrinter.slowPrint(morte2, 75);
        String morte3 = "E os ratos roerão seus ossos..."; SlowPrinter.slowPrint(morte3, 75);
    }

    static void Intro1() {
        String intro1 = "São tempos sombrios....."; SlowPrinter.slowPrint(intro1, 75);
        String intro2 = "Uma terrível sombra se ergueu no leste, sob a forma de um necromante..."; SlowPrinter.slowPrint(intro2, 75);
        String intro3 = "Suas legiões de mortos trouxeram caos e destruição ao mundo dos homens..."; SlowPrinter.slowPrint(intro3, 75);
        String intro4 = "Em resposta, o Papa ordenou uma cruzada..."; SlowPrinter.slowPrint(intro4, 75);
        String intro5 = "Você junto de muitos outros soldados marcharam através da terra devastada..."; SlowPrinter.slowPrint(intro5, 75);
        String intro6 = "Procurando por rastros que os levassem ao covil do necromante"; SlowPrinter.slowPrint(intro6, 75);
        String intro7 = "Tudo isso foi em vão...."; SlowPrinter.slowPrint(intro7, 75);
    }

    static void Intro2() {
        String intro8 = "Cada soldado humano tombado em batalha, significava um soldado a mais para o inimigo..."; SlowPrinter.slowPrint(intro8, 75);
        String intro9 = "Logo a esperança se perdeu, uma vez que vocês não encontravam o necromante em lugar algum..."; SlowPrinter.slowPrint(intro9, 75);
        String intro10 = "E então.... Numa cruel emboscada, você se viu diante do horror inimaginável....."; SlowPrinter.slowPrint(intro10, 75);
        String intro11 = "Aquele seu amigo.... Qual era mesmo o nome dele? "; SlowPrinter.slowPrint(intro11, 75);
    }

    static void Intro3(Scanner in) {
        String aliado = in.nextLine();
        String intro12 = "Sim, seu amigo " + aliado + " havia tombado em combate, e agora lutava contra você reanimado pelo necromante"; SlowPrinter.slowPrint(intro12, 75);
        String intro13 = "É triste pensar que você teria o peito perfurado pela lança daquele em que você tanto confiava"; SlowPrinter.slowPrint(intro13, 75);
        String intro14 = "Mas se alguém é culpado disso, certamente é o maldito necromante"; SlowPrinter.slowPrint(intro14, 75);
    }

    static void Intro4() {
        String intro15 = "Naquele dia, você morreu"; SlowPrinter.slowPrint(intro15, 75);
        String intro16 = "Mas hoje, você renascerá"; SlowPrinter.slowPrint(intro16, 75);
        String intro17 = "E cabe a você, levar a justiça dos homens, aos mortos..."; SlowPrinter.slowPrint(intro17, 75);
    }

    static void Intro5() {
        String intro18 = "Você acorda com uma sensação estranha, como se tivesse dormido por um século."; SlowPrinter.slowPrint(intro18, 75);
        String intro19 = "O ambiente ao seu redor é sombrio e enevoado, com um ar pesado que mal permite respirar."; SlowPrinter.slowPrint(intro19, 75);
        String intro20 = "A memória do último confronto ainda está fresca na sua mente, um lembrete doloroso de sua morte."; SlowPrinter.slowPrint(intro20, 75);
        String intro21 = "No chão ao seu redor, as marcas da batalha ainda estão visíveis, mas há algo diferente."; SlowPrinter.slowPrint(intro21, 75);
        String intro22 = "A luz fraca de uma fogueira ao longe chama sua atenção, como um farol na escuridão."; SlowPrinter.slowPrint(intro22, 75);
        String intro23 = "Você sente uma força misteriosa impulsionando-o a seguir em direção à luz."; SlowPrinter.slowPrint(intro23, 75);
        String intro24 = "Cada passo é uma luta contra a gravidade, mas você sabe que precisa seguir em frente."; SlowPrinter.slowPrint(intro24, 75);
        String intro25 = "Sentado junto a fogueira, repousa um velho homem, ele nota sua aproximação, mas não parece assustado com sua mórbida aparência"; SlowPrinter.slowPrint(intro25, 75);
        Utilidades.Espaco();
        String intro26 = "   -Foi difícil quebrar o vínculo do necromante com sua alma, se eu não o tivesse feito, você estaria sob o controle dele agora"; SlowPrinter.slowPrint(intro26, 75);
        String intro27 = "   -Ele consegue sentir sua presença, e muito em breve você vai notar a dele também, te impulsionando a maldade e a malícia"; SlowPrinter.slowPrint(intro27, 75);
        String intro28 = "   -Mas isso pode vir a calhar, ouça os susurros dele em sua mente, vá até ele, ache-o, e acabe com isso, pelo bem de todos nós"; SlowPrinter.slowPrint(intro28, 75);
    }

    static void RecusarQuest() {
        String quest1 = "Você sente o peso da missão, mas a escuridão em seu coração recusa a obrigação."; SlowPrinter.slowPrint(quest1, 75);
        Utilidades.Espaco();
        String quest2 = "   -Eu não posso aceitar essa missão, para falar a verdade, eu não deveria estar aqui."; SlowPrinter.slowPrint(quest2, 75);
        Utilidades.Espaco();
        String quest3 = "Os olhos do herói morto-vivo brilham com uma tristeza profunda enquanto ele balança a cabeça negativamente."; SlowPrinter.slowPrint(quest3, 75);
        Utilidades.Espaco();
        String quest4 = "   -Você precisa encontrar outro, alguém que não esteja preso a este limbo eterno."; SlowPrinter.slowPrint(quest4, 75);
        Utilidades.Espaco();
        String quest5 = "Ele vira as costas, confuso, e segue andando sem rumo pelo campo de batalha"; SlowPrinter.slowPrint(quest5, 75);
        Utilidades.Espaco();
        String quest6 = "   -Então você não serve de nada para mim... Diz o velho homem conjurando uma magia pelas suas costas"; SlowPrinter.slowPrint(quest6, 75);
        Utilidades.Espaco();
        String quest7 = "Seu corpo emerge em chamas por causa da bola de fogo conjurada pelo velhote"; SlowPrinter.slowPrint(quest7, 75);
        String quest8 = "Dessa vez, você morreu........ para sempre."; SlowPrinter.slowPrint(quest8, 75);
    }

    static void AceitarQuest() {
        
    }
}
