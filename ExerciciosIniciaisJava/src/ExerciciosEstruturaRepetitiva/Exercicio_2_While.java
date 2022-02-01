package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio_2_While {

	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
		Scanner sc = new Scanner(System.in);
		String quadrante;
		System.out.println("Insira o valor de x e y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		while(x != 0 && y != 0) {						
			if(x > 0){
				quadrante = (y > 0) ? "Primeiro quadrante" : "Quarto quadrante";
			}
			else {
				quadrante = (y > 0) ? "Segundo quadrante" : "Terceiro quadrante";
			}
			System.out.println(quadrante);
			System.out.println("Insira o valor de x e y");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
