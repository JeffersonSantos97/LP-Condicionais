package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); 
		
		System.out.println("Entre com o 1º numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o 2º numero: ");
		int numero2 = sc.nextInt();
		
		if(numero1 > numero2 ) {
			
			System.out.println("O maior eh o numero " + numero1);
		}else {
			System.out.println("O maior eh o numero: "+ numero2);
		}
		
		
		
		
		sc.close();
	}

}
