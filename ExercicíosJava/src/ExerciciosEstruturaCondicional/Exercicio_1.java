package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int a = sc.nextInt();
		String sim;
		sim = (a >= 0) ? "Positivo" : "Negativo";
		
		System.out.println("O número informado é: " + sim);
		sc.close();
	}

}
