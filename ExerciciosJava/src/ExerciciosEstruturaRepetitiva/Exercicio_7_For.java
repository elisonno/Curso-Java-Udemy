package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_7_For {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas, come�ando de 1 at� N. 
		Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme exemplo.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o n�mero desejado");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.printf("%d %d %d\n", i, (i*i), (i*i*i));
		}
		sc.close();
	}

}
 