package Lista_Exer_Condicional;

import java.util.Random;

public class Exer_012 {

	public static void main(String[] args) {
		
		// Formula pra gera um numero entre o outro ( inclusos ) 
		
		// int = rd.nextInt( max - min + 1 ) + min;  
		
		
		
		Random rd = new Random();

		double precoProduto1 = rd.nextDouble(1000 - 1 + 1) + 1; 

		double precoProduto2 = rd.nextDouble(1000 - 1 + 1) + 1;

		System.out.printf("Produto 1: %.2f%n", precoProduto1);
		System.out.printf("Produto 2: %.2f %n", precoProduto2);

		if (precoProduto1 < precoProduto2) {

			System.out.printf("O produto 1 eh o mais barato");
		} else if (precoProduto2 < precoProduto1) {

			System.out.println("O produto 2 eh mais barato ");
		} else {

			System.out.println("O preços são iguais");
		}

	}

}
