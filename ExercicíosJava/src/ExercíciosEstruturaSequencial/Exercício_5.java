package ExercíciosEstruturaSequencial;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
		 * e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		int codigo_item_1,codigo_item_2, quantidade_item_1, quantidade_item_2;
		double valor_item_1, valor_item_2, valor_total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o código do item 1: ");
		codigo_item_1 = sc.nextInt();
		System.out.println("Insira a quantidade desejada do item 1: ");
		quantidade_item_1 = sc.nextInt();
		System.out.println("Insira o valor unitário do item 1: ");
		valor_item_1 = sc.nextDouble();
		System.out.println("Insira o código do item 2: ");
		codigo_item_2 = sc.nextInt();
		System.out.println("Insira a quantidade desejada do item 2: ");
		quantidade_item_2 = sc.nextInt();
		System.out.println("Insira o valor unitário do item 2: ");
		valor_item_2 = sc.nextDouble();
		valor_total = (valor_item_1 * quantidade_item_1)+(valor_item_2*quantidade_item_2);
		System.out.printf("O valor a pagar no total é R$: %.2f", valor_total);
		sc.close();

	}

}
