package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
		A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na 
		origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem �Origem�. Se o ponto estiver sobre um dos 
		eixos escreva �Eixo X� ou �Eixo Y�, conforme for situa��o.*/
		double x,y;
		String opcao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de X");
		x = sc.nextDouble();
		System.out.println("Insira o valor de Y");
		y = sc.nextDouble();
		if(x == 0 || y == 0) {
			if (x == 0 && y == 0) {
				opcao = "Ponto est� na origem";
			}
			else {
				opcao = (x == 0) ? "Ponto est� no eixo X": "Ponto est� no eixo Y";
			}
		}
		else if (x > 0 && y > 0) {
			opcao = "Ponto est� no Quadrante 1";
		}
		else if (x > 0 && y < 0) {
			opcao = "Ponto est� no Quadrante 4";
		}
		else if (x < 0 && y > 0) {
			opcao = "Ponto est� no Quadrante 2";
		}
		else {
			opcao = "Ponto est� no Quadrante 3";
		}
		System.out.println(opcao);
		sc.close();
	}

}
