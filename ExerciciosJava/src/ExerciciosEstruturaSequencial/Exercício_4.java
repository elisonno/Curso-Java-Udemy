package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas 
		trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
		A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.*/
		int funcionario, horasTrabalhadas;
		double salario, valorHora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero do funcion�rio");
		funcionario = sc.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas do funcion�rio");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor que o funcion�rio recebe por hora");
		valorHora = sc.nextDouble();
		salario = valorHora * horasTrabalhadas;
		System.out.printf("N�mero do funcion�rio: %d \nS�lario do funcion�rio: %.2f",funcionario, salario);
		sc.close();
	}

}
