package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_5_For {
	public static void main(String[] args) {
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		Lembrando que, por defini��o, fatorial de 0 � 1.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o n�mero que deseja verificar o fatorial");
		int N = sc.nextInt();
		int fatorial = 1;
		for (int i= 1; i<=N; i++) {
			fatorial= fatorial * i;
		}
		System.out.println(fatorial);
		
		sc.close();
	}

}
