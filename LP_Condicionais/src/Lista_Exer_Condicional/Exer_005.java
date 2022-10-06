package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); 
		
		// nota 1 
		System.out.println("Entre com a 1º nota: ");
		double nota1 = sc.nextDouble();
		
		// nota 2 
				
		System.out.println("Entre com a 2º nota: ");
		double nota2 = sc.nextDouble();
		
		
		// media das notas 
		
		double media = (nota1 + nota2 ) / 2;
		
		System.out.printf("Media: %.2f %n", media);
		
		// SE a media for igual a 10 
		if(media == 10 ) {
			
			System.out.println("Aprovado com distinção ");
		}
		// Se a media for igual ou maior que 7 
		else if (media >= 7  ) {
			
			System.out.println("APROVADO ");
		}
		// Se a media for menor que 7 
		else {
			System.out.println("REPROVADO ");
			
		}
		
		
		sc.close();

	}

}
