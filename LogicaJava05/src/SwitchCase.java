import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero referente ao dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
		
		String dia;
		
		switch (diaDaSemana)
		{
			case 1: dia = "domingo";
				break;
			case 2: dia = "segunda-feira";
			break;
			case 3: dia = "ter�a-feira";
			break;
			case 4: dia = "quarta-feira";
			break;
			case 5: dia = "quinta-feira";
			break;
			case 6: dia = "sexta-feira";
			break;
			case 7: dia = "S�bado";
			break;
			default: dia = "INV�LIDO";
				System.err.println("Digite um dia v�lido!");
				System.exit(1);
		}
		
		System.out.println("O dia escolhido foi: " + dia);
		
		scanner.close();
	}

}
