import java.util.Scanner;

public class ValoresGastos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite abaixo os valores gastos com...");
		
		Double total = 0.0;
		
		System.out.print("Luz: ");
		total += scanner.nextDouble();
		
		System.out.print("�gua: ");
		total += scanner.nextDouble();
		
		System.out.print("Telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Escola: ");
		total += scanner.nextDouble();
		
		System.out.print("Cart�o: ");
		total += scanner.nextDouble();
		
		System.out.print("Supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O valor total gasto foi de: " + total);
		
		scanner.close();
	}

}
