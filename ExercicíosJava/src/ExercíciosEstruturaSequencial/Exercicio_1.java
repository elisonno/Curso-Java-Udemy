package Exerc�ciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela 
		//a soma desses n�meros com uma mensagem explicativa, conforme exemplos.
		
		int n1, n2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.printf("%d + %d = %d",n1, n2, soma);


	}

}
