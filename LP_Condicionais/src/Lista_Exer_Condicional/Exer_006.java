package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in ); 
		double maior = Integer.MIN_VALUE; // vai armazenar o menor valor possivel nessa variável 
		
		// Pegar o 1º numero
		System.out.println("Entre com o 1º numero: ");
		double n1 = sc.nextDouble();
			if(n1 > maior ) {
				maior = n1;
				 
			}
		// Pegar o 2º numero
		
		System.out.println("Entre com o 2º numero: ");
		double n2 = sc.nextDouble();
			
		if( n2 > maior ) {
				
				maior = n2;
			}
		
		
		
		// Pegar o 3º numero 
		
		System.out.println("Entre com o 3º numero: ");
		double n3 = sc.nextDouble();
		if(n3 > maior  ) {
			
			maior = n3;
		}
		
		System.out.println("O maior é o " + maior);
		
		sc.close();

	}

}
