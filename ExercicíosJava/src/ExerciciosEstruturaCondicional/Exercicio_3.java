package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem 
		 "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos
		 entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.*/
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Digite dois n�mero");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a % b == 0 || b % a == 0) {
			System.out.println("Os n�meros s�o multiplos");
		}
		else {
			System.out.println("Os n�meros n�o s�o multiplos");
		}
		sc.close();

	}

}
