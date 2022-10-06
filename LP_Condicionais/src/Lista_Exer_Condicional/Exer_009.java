package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); 
		
		System.out.println("Entre com o 1º numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Entre com o 2º numero: ");
		int n2 = sc.nextInt();
		
		System.out.println("Entre com o 3º numero: ");
		int n3 = sc.nextInt();
		// n1, n2, n3 
		if(n1 > n2 && n1 > n3 && n2 > n3 ) {
			System.out.printf( "%d, %d, %d %n", n1,n2,n3);
		
		} 
		// n1,n3,n2
		else if(n1 > n2 && n1 > n3 && n3 > n2 ) {
			System.out.printf( "%d, %d, %d %n", n1,n3,n2);
		} 
		
		// n2 n1 n3 
		else if(n2 > n1 && n2 > n3 && n1 > n3 ) {
			System.out.printf( "%d, %d, %d %n", n2,n1,n3);
		}
		
		// m2 n3 n1 
		
		else if(n2 > n1 && n2 > n3 && n3 > n1 ) {
			System.out.printf( "%d, %d, %d %n", n2,n3,n1);
		}
		
		// n3 n1 n2 
		
		else if(n3 > n1 && n3 > n2 && n1 > n2 ) {
			System.out.printf( "%d, %d, %d %n", n3,n1,n2);
		}
		
		// n3 n2 n1 
		
		else {
			
			
			System.out.printf( "%d, %d, %d %n", n3,n2,n1);
		}
		
		
		
		
		sc.close();

	}

}
