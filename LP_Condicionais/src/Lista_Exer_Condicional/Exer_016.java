package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
		// lado A 
		System.out.println("Entre com o lado A: ");
		double  a = sc.nextDouble();
		
		// lado B 
		System.out.println("Entre com o lado B: ");
		double  b = sc.nextDouble();
		
		// lado C 
		
		System.out.println("Entre com o lado C: ");
		double  c = sc.nextDouble();
		// Se for triangulo 
		if((a + b ) > c && ( a + c ) > b && (b + c) > a ) {
			
			// Se for equilatero
			if( a == c && a == b && b == c ) {
				
				System.out.println(" equilátero ");
			} 
			// Se for Isóceles 
			else if(a == c || a == b || b == c )  {
				
				System.out.println("ISÓCELES");
			}
			// Se for Escaleno  
			
			else if ( a != c && a != b && b != c ) {
				
				System.out.println(" ESCALENO ");
			}
			
			
		}
		// NÃO É TRIANGULO 
		else {
			
			System.out.println("NÃO É TRIANGULO");
		}
		
		
		
		
		
		sc.close();

	}

}
