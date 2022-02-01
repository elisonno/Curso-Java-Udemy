package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_7_For {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. 
		Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número desejado");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.printf("%d %d %d\n", i, (i*i), (i*i*i));
		}
		sc.close();
	}

}
 