package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in); 
		
		// Entrar com um numero 
		System.out.println("Entre com um numero: ");
		int num = sc.nextInt();
		
		// pegar  centenas ==> ( numero / 100 )
		int centenas = num / 100;
		// pegar dezenas ==> resto da centenas / 10 
		int dezenas = (num % 100 ) / 10;
		//  pergar unidade ==> resto da dezenas
		int unidade = (num % 100) % 10;
		
		System.out.println("Centena: " + centenas);
		System.out.println("Dezena: " + dezenas);
		System.out.println("Unidade: " + unidade);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
