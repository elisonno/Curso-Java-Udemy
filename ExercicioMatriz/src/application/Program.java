package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
		 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		int N, M;

		System.out.print("Enter with number of lines: ");
		M = sc.nextInt();

		System.out.print("Enter with number of columns: ");
		N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			System.out.printf("Enter with values of line %d: ", i);
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the number you want to search: ");
		int numberSearch = sc.nextInt();

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (numberSearch == mat[i][j]) {
					System.out.printf("\nPosition %d,%d:\n", i, j);

					if (j != 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j != N - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i != 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i != M - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();

	}

}
