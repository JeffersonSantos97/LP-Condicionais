package Lista_Exer_Condicional;

import java.util.Random;

public class Exer_011 {

	public static void main(String[] args) {
		
		
		// Random gera um numero automático
		Random rd = new Random();

		int nota = rd.nextInt(11);
		System.out.println("Nota: " + nota);
		if (nota < 6) {

			System.out.println(" REPROVADO ");
		} else {

			System.out.println(" APROVADO ");
		}

	}

}
