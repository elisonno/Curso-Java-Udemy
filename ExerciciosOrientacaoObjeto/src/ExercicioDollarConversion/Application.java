package ExercicioDollarConversion;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por uma pessoa
		 em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda que a pessoa ter� que 
		 pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser respons�vel pelos c�lculos.
		 */
		Scanner sc = new Scanner(System.in);
		double dollar,quantity, reais;
		System.out.println("What is the dollar price?");
		dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought");
		quantity = sc.nextDouble();
		reais = DollarConvertion.calculateRate(dollar,quantity);
		System.out.println("Amount to be paid in reais = R$ " + String.format("%.2f", reais));
		
		sc.close();

	}

}
