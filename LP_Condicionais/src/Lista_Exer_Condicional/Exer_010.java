package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); 
		
		System.out.println("Entre com M [ Matutino ] V [ Vesperino ] e N [ Noite ]: ");
		String letra = sc.next();
		
		// MATUTINO - BOA DIA 
		if(letra.equalsIgnoreCase("m")) {
			
			System.out.println("BOM DIA  ");
		} 
		// VESPERINO - BOA TARDE 
		else if (letra.equalsIgnoreCase("V")) {
			
			System.out.println("BOA TARDE !! ");
		}
		
		// NOITE - BOA NOITE 
		else if(letra.equalsIgnoreCase("N")){
			
			System.out.println("BOA NOITE !! ");
		} 
		// NUMERO INVÁLIDO
		else {
			
			System.out.println("LETRA INVÁLIDA ");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
