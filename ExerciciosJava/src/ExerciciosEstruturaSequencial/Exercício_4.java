package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, seu número de horas 
		trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
		A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
		int funcionario, horasTrabalhadas;
		double salario, valorHora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do funcionário");
		funcionario = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas do funcionário");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor que o funcionário recebe por hora");
		valorHora = sc.nextDouble();
		salario = valorHora * horasTrabalhadas;
		System.out.printf("Número do funcionário: %d \nSálario do funcionário: %.2f",funcionario, salario);
		sc.close();
	}

}
