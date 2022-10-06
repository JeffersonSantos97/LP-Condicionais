package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// entrar com o A
		System.out.println("Entre com o A: ");
		int a = sc.nextInt();
		// Se a == 0 
		if(a == 0 ) {
			System.out.println("A = 0. Programa encerrado ");
		} 
		// se a não for 0 
		else {

		// entrar com o B
		System.out.println("Entre com o B: ");
		int b = sc.nextInt();

		// entrar com o C
		System.out.println("Entre com o C: ");
		int c = sc.nextInt();
		
		// delta 
		int delta = (b*b) - (4*a*c);
		System.out.println("Delta: " + delta);
		// Se delta for negativo 
		if(delta < 0) {
			System.out.println("Não possui raizes reais ");
			
			}
		// Se delta é igual a 0 
		else if ( delta == 0 ) {
			System.out.println("Apenas uma raiz real ");

		}
		// se delta for positivo
		else {
			double x1 = (- b + Math.sqrt(delta)) / (2 * a);
			double x2 = (- b - Math.sqrt(delta)) / ( 2 * a );
			
			System.out.println("X1: " + x1);
			System.out.println("x2: " + x2);
			
		}
		}

		sc.close();

	}

}
