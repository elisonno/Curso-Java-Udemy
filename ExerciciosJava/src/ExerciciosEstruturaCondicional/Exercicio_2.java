package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro e 
		 dizer se este número é par ou ímpar.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int a = sc.nextInt();
		String par_impar;
		par_impar = (a % 2 ==  0) ? "Par" : "Impar";
		
		System.out.println("O número informado é: " + par_impar);
		sc.close();

	}

}
