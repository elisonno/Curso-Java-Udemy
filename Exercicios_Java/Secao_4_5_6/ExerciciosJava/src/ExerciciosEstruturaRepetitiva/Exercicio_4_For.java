package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_4_For {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
		 Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/ 
		Scanner sc = new Scanner(System.in);
		int N;
		double n1, n2;
		System.out.println("Insira o valor de divisões que serão calculadas");
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			System.out.println("Insira dois valores: o primeiro será dividido pelo segundo");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			if (n2 == 0) {
				System.out.printf("(%.0f / %.0f) Divisão impossível\n", n1, n2);
			}
			else {
				System.out.printf("%.0f / %.0f = %.1f\n", n1, n2, n1/n2);
			}
		}
		sc.close();
	}

}
