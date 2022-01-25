package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio_2 {

	public static final double pin = 3.14159;
	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
		//o valor da área deste círculocom quatro casas decimais.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159

		double raio, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio");
		raio = sc.nextDouble();
		area = pin * raio*raio;
		System.out.println("�?rea = π * raio²");
		System.out.printf("%.5f * %.2f² = %.4f\n", pin, raio, area);
		System.out.println("�?rea = " + area);
		sc.close();
	}

}
