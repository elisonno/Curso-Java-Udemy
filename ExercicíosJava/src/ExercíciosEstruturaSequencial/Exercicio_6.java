package ExercíciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
		A, B e C. Em seguida, calcule e mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.*/
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite três valores de ponto flutuantes");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = (a*c)/2;
		circulo = 3.14159 * Math.pow(c,2);
		trapezio =((a+b)*c)/2;
		quadrado = Math.pow(b,2);
		retangulo = a*b;
		System.out.printf("Área do triângulo: %.3f \n", triangulo);
		System.out.printf("Área do circulo: %.3f \n", circulo);
		System.out.printf("Área do trapezio: %.3f \n", trapezio);
		System.out.printf("Área do quadrado: %.3f \n", quadrado);
		System.out.printf("Área do retangulo: %.3f \n", retangulo);		
		sc.close();

	}

}
