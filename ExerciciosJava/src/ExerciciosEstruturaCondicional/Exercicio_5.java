package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e 
		a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double valor = 0;
		System.out.printf("CÓDIGO \t ESPECEIFICAÇÃO \t PREÇO\n"
						  + "1 \t Cachorro Quente \t R$ 4,00\n"
						  + "2 \t X-Salada \t\t R$ 4,50\n"
						  + "3 \t X-Bacon \t\t R$ 5,00\n"
						  + "4 \t Torrada Simples \t R$ 2,00\n"
						  + "5 \t Refrigerante \t\t R$ 1,50\n");
		System.out.printf("Qual o produto desejado?\n"
				          + "Insira o código");
		codigo = sc.nextInt();
		System.out.println("Insira a quantidade desejada");
		quantidade = sc.nextInt();
		switch (codigo) {
		case 1:
			valor = quantidade * 4.00;
			break;
		case 2:
			valor = quantidade * 4.50;
			break;
		case 3:
			valor = quantidade * 5.00;
			break;
		case 4:
			valor = quantidade * 2.00;
			break;
		case 5:
			valor = quantidade * 1.50;
			break;
		default:
			System.out.println("O codigo selecionado é inválido");
		}
		if(valor != 0) {
			System.out.printf("Total da compra é: %.2f", valor);
		}		
		sc.close();

	}

}
