package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_3_For {

	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores 
		reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que 
		o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/
		Scanner sc = new Scanner(System.in);
		int N;
		double nota, media= 0;
		System.out.println("Insira o valor de quantas médias serão calculadas");
		N = sc.nextInt();
		for(int i=1; i<= N; i++) {
			for(int j=1; j<=3; j++) {
				System.out.printf("Insira a %dª nota:\n", j);
				nota=sc.nextDouble();
				switch(j) {
				case 1: media = nota*2;
					break;
				case 2: media = media +(nota * 3);
					break;
				case 3: media = (media +(nota * 5))/10;
					break;
				}				
			}
			System.out.printf("A média do %dº alunoe foi %.1f:\n", i, media);
		}
		sc.close();
	}

}
