package Exercicio_3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre 
		 vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno 
		 está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado 
		 (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 */
		Scanner sc = new Scanner(System.in);
		Student student_1 = new Student();
		
		System.out.println("Enter name student");
		student_1.name = sc.nextLine();
		
		System.out.println("Enter three grades student");
		student_1.note_1 = sc.nextDouble();
		student_1.note_2 = sc.nextDouble();
		student_1.note_3 = sc.nextDouble();
		
		System.out.println(student_1);
		
		sc.close();
		
	}

}