package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_4_For {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo segundo. 
		 Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/ 
		Scanner sc = new Scanner(System.in);
		int N;
		double n1, n2;
		System.out.println("Insira o valor de divis�es que ser�o calculadas");
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			System.out.println("Insira dois valores: o primeiro ser� dividido pelo segundo");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			if (n2 == 0) {
				System.out.printf("(%.0f / %.0f) Divis�o imposs�vel\n", n1, n2);
			}
			else {
				System.out.printf("%.0f / %.0f = %.1f\n", n1, n2, n1/n2);
			}
		}
		sc.close();
	}

}
