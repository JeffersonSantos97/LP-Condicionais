package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;

		System.out.println("Entre com o 1º numero: ");
		double n1 = sc.nextDouble();

		if (n1 > maior) {

			maior = n1;
		}

		if (n1 < menor) {

			menor = n1;
		}

		System.out.println("Entre com o 2º numero: ");
		double n2 = sc.nextDouble();
		if (n2 > maior) {

			maior = n2;
		}

		if (n2 < menor) {

			menor = n2;
		}
		System.out.println("Entre com o 3º numero: ");
		double n3 = sc.nextDouble();

		if (n3 > maior) {

			maior = n3;
		}

		if (n3 < menor) {

			menor = n3;
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		sc.close();

	}

}
