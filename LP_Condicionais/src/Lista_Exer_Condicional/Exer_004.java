package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in); 
		
		System.out.print("Entre com uma letra: ");
		String letra = sc.next();
		
		
		// 
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") 
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			
			System.out.println(" VOGAL ");
			
		}else {
			
			System.out.println(" CONSOANTE ");
		}
		
		
		
		
		
		
		// Resolução com o ( switch )  
		
		/* switch(letra) {
		
		case "a": System.out.println("VOGAL "); break; 
		case "A": System.out.println("VOGAL "); break;{}
		case "e": System.out.println("VOGAL "); break;
		case "E": System.out.println("VOGAL "); break;
		case "i": System.out.println("VOGAL "); break;
		case "I": System.out.println("VOGAL "); break;
		case "o": System.out.println("VOGAL "); break;
		case "O": System.out.println("VOGAL "); break;
		case "u": System.out.println("VOGAL "); break;
		case "U": System.out.println("VOGAL "); break;
		default: System.out.println("CONSOANTE");
		
		
		
		}
		*/
		
		
		
		
		sc.close();

	}

}
