package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); 
		System.out.println("Entre com um numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			
			System.out.println("POSITIVO ");
		}
		
		else {
			System.out.println(" NEGATIVO ");
		}
		
		
		
		
		sc.close();

	}

}
