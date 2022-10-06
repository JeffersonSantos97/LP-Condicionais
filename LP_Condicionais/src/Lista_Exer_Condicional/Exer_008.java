package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); 
		
		
		System.out.println("Entre com o valor do 1º produto: ");
		double produto1 = sc.nextDouble();
		
		System.out.println("Entre com o valor do 2º produto: ");
		double produto2 = sc.nextDouble();
		
		System.out.println("Entre com o valor do 3º produto: ");
		double produto3 = sc.nextDouble();
		// produto 1 sendo o menor 
		
		if(produto1 < produto2 && produto1 < produto3) {
			
			System.out.println("Compre o produto 1 ");
		}
		// produto 2 sendo o menor 
		else if (produto2 < produto1 && produto2 < produto3) {
			
			System.out.println("Compre o produto 2 ");
		}
		
		// prodito 3 sendo o menor 
		else if(produto3 < produto1 && produto3 < produto2) {
			
			System.out.println("Compre o produto 3 ");
		} else {
			
			System.out.println("TODOS COM PRECÕS IGUAIS");
		}
		
		sc.close();

	}

}
