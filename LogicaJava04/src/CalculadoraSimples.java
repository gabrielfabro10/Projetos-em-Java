import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Opera��o [1= + | 2 = - | 3 = * | 4 = /] ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		
		if(operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		if(operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("Resultado " + resultado);
		
		scanner.close();
	
	}

}
