package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_6_For {

	public static void main(String[] args) {
		/* Ler um número inteiro N e calcular todos os seus divisores..*/ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número que deseja verificar os divisores");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			if (N%i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
