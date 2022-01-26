package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_2_For {

	public static void main(String[] args) {
		/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida. Mostre quantos destes 
		 valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es conforme exemplo 
		 (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/ 
		Scanner sc = new Scanner(System.in);
		int N, X, in=0, out=0;
		System.out.println("Insira o valor de n�meros que ser�o inseridos\n para verificar se est�o no intervalo [10,20]");
		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Insira um valor");
			X = sc.nextInt();
			if(X >= 10 && X<=20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.printf("%d est�o dentro do intervalo\n"
				+ "%d est�o fora do intervalo", in, out);
		
		sc.close();

	}

}
