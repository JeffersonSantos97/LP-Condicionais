package Lista_Exer_Condicional;

import java.util.Random;

public class Exer_013 {

	public static void main(String[] args) {
		
Random rd = new Random();
		
		// entre 0 e 20 (inclusos)
		int a = rd.nextInt(20 - 0 + 1) + 0;
		
		// entre 0 e 1000 ( inclusos)
		int b = rd.nextInt(1000 - 0 + 1) + 0;
		
		System.out.println("A: " + a );
		System.out.println("B: " + b);
		
		if(b % a == 0 ) {
			
			System.out.println("Divisível ");
		}else {
			
			System.out.println("NÃO é divisivel ");
		}

	}

}
