package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
		// numero correspondente a semana 
		
		System.out.println("Entre com um numero correspondete a semana: ");
		
		int num = sc.nextInt();
		
		switch(num ) {
		
		// 1 - Domingo
		case 1: System.out.println(" DOMINGO ");break;
		
		
		// 2 - Segunda
		case 2: System.out.println(" Segunda ");break;
		
		
		// 3 - Terca 
		case 3: System.out.println(" Terça ");break;
		
		
		// 4 - Quarta
		case 4: System.out.println(" Quarta ");break;
		
		// 5 - Quinta
		case 5: System.out.println(" Quinta ");break;
		
		// 6 - Sexta
		case 6: System.out.println(" Sexta ");break;
		
		// 7 - Sábado
		case 7: System.out.println(" Sabado ");break;
		// valor inválido
		default: System.out.println(" VALOR INVÁLIDO ");
		
		}
		
		
		
		
		
		sc.close();

	}

}
