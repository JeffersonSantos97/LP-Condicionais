package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ano 
		
		System.out.println("Entre com o ano: ");
		 int ano = sc.nextInt();
		 
		 // ano bissexto 
		 
		 if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
	
			 System.out.println("O ano " + ano + " é bissexto");
			
		 }
		 // NÃO é bissexto 
		 else {
			 
			 System.out.println("O ano " + ano + " NÃO é bissexto");
		 }
		
		
		
		
		
		
		
		sc.close();

	}

}
