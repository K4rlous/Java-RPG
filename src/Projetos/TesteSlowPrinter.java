package Projetos;

public class TesteSlowPrinter {
    public static void main(String[] args) {
    	Inventory inventario = new Inventory();
    	String m3 = "Eles não são humanos.....";
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	String m1 = "Você pegou: Espada curta e Escudo velho";
    	SlowPrinter.slowPrint(m3, 75);
        inventario.adicionarItem("Espada Curta");
        inventario.adicionarItem("Escudo velho");
        SlowPrinter.slowPrint(m1, 75); // Chama a função slowPrint da classe SlowPrinter
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        String m2 = "Escuto eles se aproximando...";
        SlowPrinter.slowPrint(m2, 75);
        inventario.listarItens();
        try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Deu certo?");
    }	
}

