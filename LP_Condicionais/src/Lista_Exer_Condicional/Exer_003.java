package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.print("Entre com F [ Feminino ] ou M [ Masculino ]: ");
		String letra = sc.next();
		
		if(letra.equalsIgnoreCase("f")) {
			System.out.println("FEMININO");
		}
		else if(letra.equalsIgnoreCase("m") ) {
			
			System.out.println("MASCULINO ");
		}
		else {
			System.out.println("SEXO INVÁLIDO !!!!! ");
			
		} 
		
		
		
		
		
		sc.close();

	}

}
