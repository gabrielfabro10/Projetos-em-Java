import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		
		System.out.print("Digite seu peso (em KG): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em metros)");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double indiceMassaCorporal = peso / alturaAoQuadrado;
		
		System.out.println("Seu Imc É: " + indiceMassaCorporal);
		
		scanner.close();
	}

}
