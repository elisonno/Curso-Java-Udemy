package Exerc�ciosEstruturaSequencial;

import java.util.Scanner;

public class Exerc�cio_5 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
		 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 
		 * e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/
		
		int codigo_item_1,codigo_item_2, quantidade_item_1, quantidade_item_2;
		double valor_item_1, valor_item_2, valor_total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o c�digo do item 1: ");
		codigo_item_1 = sc.nextInt();
		System.out.println("Insira a quantidade desejada do item 1: ");
		quantidade_item_1 = sc.nextInt();
		System.out.println("Insira o valor unit�rio do item 1: ");
		valor_item_1 = sc.nextDouble();
		System.out.println("Insira o c�digo do item 2: ");
		codigo_item_2 = sc.nextInt();
		System.out.println("Insira a quantidade desejada do item 2: ");
		quantidade_item_2 = sc.nextInt();
		System.out.println("Insira o valor unit�rio do item 2: ");
		valor_item_2 = sc.nextDouble();
		valor_total = (valor_item_1 * quantidade_item_1)+(valor_item_2*quantidade_item_2);
		System.out.printf("O valor a pagar no total � R$: %.2f", valor_total);
		sc.close();

	}

}
