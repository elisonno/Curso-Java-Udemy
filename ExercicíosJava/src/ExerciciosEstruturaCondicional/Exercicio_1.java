package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro, e 
		 * depois dizer se este n�mero � negativo ou n�o.*/		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int a = sc.nextInt();
		String sim;
		sim = (a >= 0) ? "Positivo" : "Negativo";
		
		System.out.println("O n�mero informado �: " + sim);
		sc.close();
	}

}
