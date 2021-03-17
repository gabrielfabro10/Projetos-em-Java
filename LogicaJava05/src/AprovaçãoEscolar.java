import java.util.Scanner;

public class Aprova��oEscolar {
	static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
	
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
		
		System.out.print("Portugu�s: "); 
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Matem�tica: "); 
		Double notaDeMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NOTA_MINIMA;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

		if (passou) {
			System.out.println("Parab�ns! Voc� passou.");
		} else {
			System.out.println("Infelizmente, n�o foi dessa vez.");
		}
		
		scanner.close();
	}
}
