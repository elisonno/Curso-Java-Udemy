package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro e 
		 dizer se este n�mero � par ou �mpar.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int a = sc.nextInt();
		String par_impar;
		par_impar = (a % 2 ==  0) ? "Par" : "Impar";
		
		System.out.println("O n�mero informado �: " + par_impar);
		sc.close();

	}

}
