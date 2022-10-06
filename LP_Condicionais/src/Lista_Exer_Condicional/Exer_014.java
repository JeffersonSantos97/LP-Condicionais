package Lista_Exer_Condicional;

import java.util.Scanner;

public class Exer_014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		
		
		
		
		
		int percentual = 0;
		double aumento = 0;
		double salarioReajustado = 0;
		// salario
		
		System.out.println("Entre com o salário: ");
		double salario = sc.nextDouble();
		
		// salario até 280,00 ( incluindo ) aumento 20% 
		if(salario <= 280) {
			
			percentual = 20; 
			aumento = (salario * percentual)  / 100;
			salarioReajustado = salario + aumento;
		} 
		// entre 280,00 e 700,00 ( não inclui 700 ) / aumento 15%
		else if (salario > 280 && salario < 700) {
			
			percentual = 15;
			aumento = (salario * percentual ) / 100;
			salarioReajustado = salario + aumento;
		}
		// entre 700,00 e 1500,00 aumento 10%
		
		else if(salario > 700 && salario < 1500){
			
			percentual = 10; 
			aumento = (salario * percentual) / 100;
			salarioReajustado = salario + aumento;
			
		}
		//1500,00 em diante aumento 5%
		else {
			
			percentual = 5;
			aumento = (salario * percentual ) / 100;
			salarioReajustado = salario + aumento;
		}
		
		
		
		
		/* Mostrar na tela */
		
		// salario antes do reajuste 
		System.out.println("salario antes do reajuste: " + salario);
		
		// o percentual de aumento aplicado 
		System.out.println( "percentual de aumento: " + percentual + "%");
		
		//o valor do aumento 
		System.out.println("Aumento: " + aumento);
		
		// novo salário após o aumento 
		System.out.println("Novo salário: " + salarioReajustado);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
