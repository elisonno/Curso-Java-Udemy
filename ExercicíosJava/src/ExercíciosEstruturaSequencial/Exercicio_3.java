package ExercíciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto de A e B pelo 
		//produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		int a, b, c, d, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os 4 números");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		resultado = a * b - c * d;
		System.out.printf("(%d * %d) - (%d * %d) = %d", a, b, c, d, resultado);
		sc.close();
	}

}
