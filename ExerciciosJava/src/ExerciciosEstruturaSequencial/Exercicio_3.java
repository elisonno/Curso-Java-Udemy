package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferen�a do produto de A e B pelo 
		//produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		int a, b, c, d, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os 4 n�meros");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		resultado = a * b - c * d;
		System.out.printf("(%d * %d) - (%d * %d) = %d", a, b, c, d, resultado);
		sc.close();
	}

}
