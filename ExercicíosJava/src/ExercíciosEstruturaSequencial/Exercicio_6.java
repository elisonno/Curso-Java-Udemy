package Exerc�ciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: 
		A, B e C. Em seguida, calcule e mostre:
		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		b) a �rea do c�rculo de raio C. (pi = 3.14159)
		c) a �rea do trap�zio que tem A e B por bases e C por altura.
		d) a �rea do quadrado que tem lado B.
		e) a �rea do ret�ngulo que tem lados A e B.*/
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite tr�s valores de ponto flutuantes");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = (a*c)/2;
		circulo = 3.14159 * Math.pow(c,2);
		trapezio =((a+b)*c)/2;
		quadrado = Math.pow(b,2);
		retangulo = a*b;
		System.out.printf("�rea do tri�ngulo: %.3f \n", triangulo);
		System.out.printf("�rea do circulo: %.3f \n", circulo);
		System.out.printf("�rea do trapezio: %.3f \n", trapezio);
		System.out.printf("�rea do quadrado: %.3f \n", quadrado);
		System.out.printf("�rea do retangulo: %.3f \n", retangulo);		
		sc.close();

	}

}
